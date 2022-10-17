package ar.edu.unlam.tallerweb1.domain;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroUsuario;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class ServicioRegistroUsuarioUsuarioTest extends SpringTest {
    @Autowired
    ServicioRegistroUsuario servicioRegistroUsuario;

    @Test
    public void dadoDatosDeUsuarioDebeValidarYGuardarNuevoUsuario() {
        assertThat(servicioRegistroUsuario.registrarNuevoUsuario("test@test.com", "1234")).isNotNull();
    }
}
