package br.org.serratec.biblioteca.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer usuarioId;
	
	@Column(name = "user_nome")
	private String nome;
	
	@Column(name = "user_email")
	private String email;
	
	@Column(name = "user_password")
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id", referencedColumnName = "perfil_id")
	private Perfil perfilId;
	
	public Usuario() {
	}
	
	public Usuario(Integer usuarioId, String nome, String email, String password, Perfil perfilId) {
		super();
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.perfilId = perfilId;
	}

	public Perfil getPerfil() {
		return perfilId;
	}

	public void setPerfil(Perfil perfil) {
		this.perfilId = perfil;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	

}
