package ar.edu.unlam.tallerweb1.domain.usuarios;

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
        this.repositorioUsuario.guardar(currentUser);
    }

}
