package ar.edu.unlam.tallerweb1.domain;

import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionService {
    Usuario currentUser = null;
    public void setActualUser(Usuario usuarioBuscado) {
        this.currentUser = usuarioBuscado;
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }
}
