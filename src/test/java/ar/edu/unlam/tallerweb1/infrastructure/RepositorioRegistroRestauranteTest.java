package ar.edu.unlam.tallerweb1.infrastructure;


import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.restaurant.RepositorioRestaurante;
import ar.edu.unlam.tallerweb1.domain.restaurant.Restaurante;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RepositorioRegistroRestauranteTest extends SpringTest {
	@Autowired
	private RepositorioRestaurante repositorioRestaurante;

	@Test
	@Rollback
	@Transactional
	public void buscarRestauranteDeAdministradorTraerSoloLosDeAdministrador() {
		Usuario jose = dadoQueExisteAdministrador();
		Usuario mafalda = dadoQueExisteAdministrador();
//		dadoQueExisteRestauranteDeAdministrador(jose);
//		dadoQueExisteRestauranteDeAdministrador(mafalda);
//
//		List<Restaurante> restaurantesDeMafalda = cuandoBuscoRestauranteDe(mafalda);
//		entoncesEncuentro(restaurantesDeMafalda,1);
	}

	private void entoncesEncuentro(List<Restaurante> restaurantes, Integer cantidadEsperada) {
		assertEquals(restaurantes, cantidadEsperada);
	}

	private List<Restaurante> cuandoBuscoRestauranteDe(Usuario administrador) {
		return repositorioRestaurante.buscarPor(administrador);
	}

	private void dadoQueExisteRestauranteDeAdministrador(Usuario administrador) {
		Restaurante resto = new Restaurante();
		resto.setAdministrador(administrador);
		session().save(resto);
	}

	private Usuario dadoQueExisteAdministrador() {
		Usuario administrador = new Usuario();
		session().save(administrador);
		return administrador;
	}

}
