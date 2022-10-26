package ar.edu.unlam.tallerweb1.delivery;
import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioLogin;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioLoginImpl;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControladorLoginTest extends SpringTest{

    private ControladorLogin controladorLogin;
    private ServicioLogin servicioLogin;
    private SessionService sessionService;

    private Usuario usuario;

    @Before
    public void init(){
        this.servicioLogin = mock(ServicioLoginImpl.class);
        this.sessionService = mock(SessionService.class);
        this.controladorLogin = new ControladorLogin(this.servicioLogin, this.sessionService);
    }

    @Test
    public void dadoUnUsuarioSinRolDebeRedireccionarloASeleccionDeRol() {
//        dadoUnUsuarioSinRol();
//        assertThat(usuario.getRol()).isNull();
//        assertThat(usuario.getEmail()).isEqualTo("test@test.com");
//        debeRedireccionarASeleccionDeRol();
    }

    private void dadoUnUsuarioSinRol() {
        when(servicioLogin.consultarUsuario("test@test.com", "123")).thenReturn(new Usuario("test@test.com", "123"));
    }

}

