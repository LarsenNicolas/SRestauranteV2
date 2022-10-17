package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioUsuarioImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ControladorElegirRolTest extends SpringTest {
    private ControladorElegirRol controladorElegirRol;
    private ServicioUsuario servicioUsuario;
    private SessionService sessionService;

    @Before
    public void init(){
        this.servicioUsuario = new ServicioUsuario(mock(RepositorioUsuarioImpl.class));
        this.sessionService = new SessionService();
        this.controladorElegirRol = new ControladorElegirRol(this.servicioUsuario, this.sessionService);
    }

    @Test
    public void dadoUnNuevoUsuarioSetearRolElegidoYRedireccionarAVistaCorrecta() {

    }

}
