package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.restaurant.Mesa;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;

public class DatosReserva {
    private Usuario cliente;
    private Mesa mesa;

    public Usuario getCliente() {
        return cliente;
    }
    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
