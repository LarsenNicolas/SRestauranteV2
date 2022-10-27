package ar.edu.unlam.tallerweb1.domain.usuarios;

import ar.edu.unlam.tallerweb1.domain.system.Gusto;
import ar.edu.unlam.tallerweb1.domain.system.RestriccionAlimentaria;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String password;
	private RolUsuario rol;
	private Boolean activo = false;
	private Gusto gusto;
	private RestriccionAlimentaria restriccionAlimentaria;

	public Usuario(String mail, String password) {
		this.email = mail;
		this.password = password;
		this.rol = null;
		this.gusto = null;
	}

	public Usuario() {

	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RolUsuario getRol() {
		return rol;
	}
	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
    public void activar() {
		activo = true;
    }

	public void setGusto(Gusto gusto) {
		this.gusto = gusto;
	}
}
