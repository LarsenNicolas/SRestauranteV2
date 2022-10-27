package ar.edu.unlam.tallerweb1.domain.restaurant;

import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;

import java.util.HashMap;
import java.util.Map;

public class Reserva {
    private Long id;
    private Usuario cliente;
    private Map<Usuario, Mesa> reservas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reserva() {

    }

    public Reserva(Usuario cliente, Mesa mesa) {
        reservas = new HashMap<>();
        reservas.put(cliente, mesa);
    }
}