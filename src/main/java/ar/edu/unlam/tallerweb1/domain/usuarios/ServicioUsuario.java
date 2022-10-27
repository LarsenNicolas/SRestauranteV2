package ar.edu.unlam.tallerweb1.domain.usuarios;

import ar.edu.unlam.tallerweb1.domain.system.Gusto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioUsuario {
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    public ServicioUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public void seleccionarRol(String rolUsuario, Usuario currentUser) {
        currentUser.setRol(RolUsuario.valueOf(rolUsuario));
        this.repositorioUsuario.modificar(currentUser);
    }

    public void seleccionarGusto(Gusto gusto, Usuario currentUser) {
        currentUser.setGusto(gusto);
        this.repositorioUsuario.modificar(currentUser);
    }
}
