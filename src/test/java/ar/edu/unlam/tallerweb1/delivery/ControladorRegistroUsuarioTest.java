package ar.edu.unlam.tallerweb1.delivery;
import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroUsuario;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioUsuarioImpl;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ControladorRegistroUsuarioTest extends SpringTest {

    private ControladorRegistroUsuario controladorRegistroUsuario;
    private ServicioRegistroUsuario servicioRegistroUsuario;
    private SessionService sessionService = new SessionService();

    @Before
    public void init(){
        this.servicioRegistroUsuario = new ServicioRegistroUsuario(mock(RepositorioUsuarioImpl.class), mock(SessionService.class));
        this.controladorRegistroUsuario = new ControladorRegistroUsuario(this.servicioRegistroUsuario, this.sessionService);
    }

    @Test
    public void alRegistrarmeCorrectamenteDebeRedireccionarmeASeleccionDeRol() {
        DatosLogin datos = new DatosLogin();
        datos.setEmail("test@test.com");
        datos.setPassword("1234");
        assertThat(controladorRegistroUsuario.validarRegistro(datos).getViewName()).isEqualTo("redirect:/elegir-role");
    }

}
