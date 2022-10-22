package ar.edu.unlam.tallerweb1.domain.usuarios;
import ar.edu.unlam.tallerweb1.domain.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioRegistroUsuario {
    private RepositorioUsuario repositorioUsuario;
    private SessionService sessionService;

    @Autowired
    public ServicioRegistroUsuario(RepositorioUsuario servicioLoginDao){
        this.repositorioUsuario = servicioLoginDao;
        this.sessionService = new SessionService();
    }
    public void registrarNuevoUsuario(String mail, String password) {
        try {
            this.validarMail(mail);
            this.validarPassword(password);
            Usuario nuevoUsuario = new Usuario(mail, password);
            repositorioUsuario.guardar(nuevoUsuario);
            sessionService.setActualUser(nuevoUsuario);
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
