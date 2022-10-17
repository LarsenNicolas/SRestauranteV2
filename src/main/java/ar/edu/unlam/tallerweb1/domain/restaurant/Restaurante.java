package ar.edu.unlam.tallerweb1.domain.restaurant;

import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String descripcion;
    private String horario;
    private Menu menu;
    private List<Mesa> mesas;
    
    @ManyToOne //(optional =false , cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	private Usuario administrador;

    public Restaurante(String nombre, String direccion, String telefono, String descripcion, String horario) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.horario = horario;
        this.mesas = new ArrayList<Mesa>();
    }

    public Restaurante(String nombre) {
        super();
        this.nombre = nombre;
        this.mesas = new ArrayList<Mesa>();
    }

    public Restaurante() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean agregarMesa(Mesa mesa) {
        return mesas.add(mesa);
    }

    public void ocuparMesa(int numeroMesa) {
        this.getMesaPorNumero(numeroMesa).setOcupada(true);
    }

    public Mesa getMesaPorNumero(int numeroMesa) {
        return this.mesas.stream().filter(mesa -> mesa.getNumero() == numeroMesa).findFirst().get();
    }

    public void desocuparMesa(int numeroMesa) {
        mesas.get(numeroMesa).setOcupada(false);
    }

    public void eliminarMesa(int numeroMesa) {
        this.mesas.removeIf(mesa -> mesa.getNumero() == numeroMesa);
    }

    public void cambiarCapacidadMesa(int numeroMesa, int nuevaCapacidad) {
        getMesaPorNumero(numeroMesa).setCapacidad(nuevaCapacidad);
    }

    public List<Mesa> getMesas() {
        return this.mesas;
    }

	public void setAdministrador(Usuario administrador) {
	    this.administrador=administrador;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
