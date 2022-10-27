//package ar.edu.unlam.tallerweb1.delivery;
//
//import ar.edu.unlam.tallerweb1.SpringTest;
//import org.junit.Test;
//import org.springframework.web.servlet.ModelAndView;
//import static org.assertj.core.api.Assertions.assertThat;
//public class ControladorRegistrarRestauranteTest extends SpringTest {
//
//    ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante();
//
//    @Test
//    public void queSePuedaRegistrarUnRestaurante(){
//
//        dadoQueExisteUnControldaroRestaurante("Mi Resto");
//
//        ModelAndView nav = cuandoVoyARegistrarUnRestaurante();
//
//        entoncesEncuentro(nav, "Mi Resto");
//
//    }
//
//    private void entoncesEncuentro(ModelAndView nav, String nombre) {
//        assertThat(nav.getModel().get("restaurantes")).hasToString(nav.getViewName());//as("Mi Resto");
//    }
//
//    private ModelAndView cuandoVoyARegistrarUnRestaurante() {
//        return controladorRegistrarRestaurante.irARegistrarRestaurante();
//    }
//
//    private void dadoQueExisteUnControldaroRestaurante(String nombre) {
//        ControladorRegistrarRestaurante controladorRegistrarRestaurante = new ControladorRegistrarRestaurante();
//    }
//
//}