package ar.edu.unlam.tallerweb1.domain.restaurant;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;

import java.util.List;

public interface RepositorioRestaurante {
	public List<Restaurante> buscarPor(Usuario administrador);
}
