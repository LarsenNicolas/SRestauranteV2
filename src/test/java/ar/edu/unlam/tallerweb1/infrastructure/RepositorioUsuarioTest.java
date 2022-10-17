package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.usuarios.RolUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositorioUsuarioTest extends SpringTest {

    @Autowired
    private RepositorioUsuarioImpl repositorioUsuarioImpl;

    @Test
    @Transactional
    @Rollback
    public void debeBuscarUsuarioPorMail() {
        Usuario usuarioFueEncontrado = this.repositorioUsuarioImpl.buscar("hola@test.com");
        assertThat(usuarioFueEncontrado).isNull();
    }

    @Test
    @Transactional @Rollback
    public void crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setEmail("test1@test.com");
        usuario.setPassword("1234");
        usuario.setRol(RolUsuario.Administrador);
        session().save(usuario);
        Usuario usuarioFueEncontrado = this.repositorioUsuarioImpl.buscar("test1@test.com");
        assertThat(usuario.getId()).isEqualTo(usuarioFueEncontrado.getId());
        assertThat(usuario.getId()).isNotNull();
    }
}
