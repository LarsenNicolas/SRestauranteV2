//package ar.edu.unlam.tallerweb1.delivery;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import ar.edu.unlam.tallerweb1.SpringTest;
//import ar.edu.unlam.tallerweb1.domain.restaurant.Mesa;
//import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
//import org.junit.Test;
//import org.springframework.web.servlet.ModelAndView;
//
//public class ControladorReservaTest extends SpringTest {
//
//    private boolean ocupada;
//    Mesa mesa = new Mesa(1,4,ocupada);
//    Usuario juan = new Usuario("juan","bringa");
//    Set <Usuario> clientes = new HashSet<>();
//    List <Mesa> mesas = new ArrayList<>();
//
//    ControladorReserva controladorReserva = new ControladorReserva();
//
//    @Test
//    public void queSePuedaRegistrarUnRestaurante(){
//
//        dadoQueExisteUnUsuario(juan);
//
//        ModelAndView nav = cuandoVoyARegistrarUnaReserva(juan,4,asignarMesa());
//
//        entoncesEncuentro(nav, "Juan");
//
//    }
//
//    @Test
//    public void queSeIndiqueTiempoDeEsperaSiNoHayMesaDisponible() {
//
//        dadoQueExisteUnUsuario(juan);
//
//        ModelAndView nav = cuandoBuscoLaReservaDe(juan,mesa);
//
//        entoncesEncuentro(nav, "Juan");
//
//    }
//
//    private ModelAndView cuandoBuscoLaReservaDe(Usuario cliente, Mesa mesa) {
//
//        return null;
//    }
//
//    private void entoncesEncuentro(ModelAndView nav, String string) {
//        assertThat(nav.getModel().get("reserva")).hasToString(nav.getViewName());
//    }
//
//    private void dadoQueExisteUnUsuario(Usuario cliente) {
//        clientes.add(cliente);
//
//    }
//
//    private ModelAndView cuandoVoyARegistrarUnaReserva(Usuario cliente, Integer comensales, Integer numeroMesa) {
//
//        return controladorReserva.irARegistrarReserva();
//    }
//
//    private Integer asignarMesa() {
//        Integer mesaAsignada=0;
//
//        for (Mesa mesa : mesas) {
//            if(mesa.isOcupada()) {
//                return mesaAsignada;
//            }else {
//                mesaAsignada=mesa.getNumero();
//            }
//        }
//        return mesaAsignada;
//    }
//
//
//
//}
