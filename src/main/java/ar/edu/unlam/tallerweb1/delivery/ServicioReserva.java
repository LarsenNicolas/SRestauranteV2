package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.restaurant.Mesa;
import ar.edu.unlam.tallerweb1.domain.restaurant.Reserva;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;

public interface ServicioReserva {

    Reserva consultarReserva(Usuario cliente, Mesa mesa);

}