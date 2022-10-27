package ar.edu.unlam.tallerweb1.domain;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.system.Gusto;
import ar.edu.unlam.tallerweb1.domain.usuarios.RepositorioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.RolUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioUsuarioImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.mockito.Mockito.mock;

public class ServicioElegirGustosTest extends SpringTest {
    @Autowired
    private RepositorioUsuario repositorioUsuario;
    private Usuario cliente;
    private ServicioUsuario servicioUsuario;

    @Before
    public void init() {
        servicioUsuario = new ServicioUsuario(mock(RepositorioUsuarioImpl.class));
    }

    @Test
    @Rollback
    @Transactional
    public void siendoClienteDeboAlmacenarMisGustos() {
        dadoUnCliente();
        debeAgregarAMiListaDeGustosUnGusto();
    }

    private void debeAgregarAMiListaDeGustosUnGusto() {
        servicioUsuario.seleccionarGusto(Gusto.Salado, cliente);
    }

    private void dadoUnCliente() {
        cliente = new Usuario("test@test.com","1");
        cliente.setRol(RolUsuario.Cliente);
    }
}
