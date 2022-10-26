package ar.edu.unlam.tallerweb1.domain.usuarios;
import ar.edu.unlam.tallerweb1.domain.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioRegistroUsuario {
    private SessionService sessionService;
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    public ServicioRegistroUsuario(RepositorioUsuario repositorioUsuario, SessionService sessionService){
        this.repositorioUsuario = repositorioUsuario;
        this.sessionService = sessionService;
    }
    public void registrarNuevoUsuario(String mail, String password) {
        try {
            this.validarMail(mail);
            this.validarPassword(password);
            Usuario nuevoUsuario = new Usuario(mail, password);
            sessionService.setActualUser(nuevoUsuario);
            repositorioUsuario.guardar(nuevoUsuario);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar nuevo usuario");
        }
    }

    private void validarMail(String email) {
        if (repositorioUsuario.buscar(email) != null)
            throw new RuntimeException("Mail invalido");
    }

    private void validarPassword(String password) {
        if (password == "")
            throw new RuntimeException("Contrasenia invalida");
    }
}
