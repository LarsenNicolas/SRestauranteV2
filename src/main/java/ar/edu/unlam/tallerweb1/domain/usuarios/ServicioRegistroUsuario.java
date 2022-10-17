package ar.edu.unlam.tallerweb1.domain.usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioRegistroUsuario {
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    public ServicioRegistroUsuario(RepositorioUsuario servicioLoginDao){
        this.repositorioUsuario = servicioLoginDao;
    }
    public Usuario registrarNuevoUsuario(String mail, String password) {
        if (this.validarMail(mail) && this.validarPassword(password)) {
            Usuario nuevoUsuario = new Usuario(mail, password);
            repositorioUsuario.guardar(nuevoUsuario);
            return nuevoUsuario;
        }
        return null;
    }

    private boolean validarMail(String email) {
        return true;
    }

    private boolean validarPassword(String password) {
        return true;
    }
}
