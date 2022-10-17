package ar.edu.unlam.tallerweb1.delivery;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class ControladorRegistrarRestauranteTest {

    @Test
    public void queSePuedaRegistrarUnRestaurante() {
        ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante("Mi Restaurante");
        String nombre = "Mi Restaurante";
		ModelAndView nav = controladorRegistrarRestaurante.irARegistroExitosoRestaurante(nombre);
    }

}