package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.restaurant.Mesa;
import ar.edu.unlam.tallerweb1.domain.restaurant.Reserva;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioReserva")
@Transactional
public class ServicioReservaImpl implements ServicioReserva{
    @Override
    public Reserva consultarReserva(Usuario cliente, Mesa mesa) {
        return null;
    }
}
