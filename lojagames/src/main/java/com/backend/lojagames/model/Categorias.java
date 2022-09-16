package com.backend.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")

public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 2, max = 50, message = "O nome deve ter de 2 à 50 caracteres")
	private String ps4;
	
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 2, max = 50, message = "O nome deve ter de 2 à 50 caracteres")
	private String xbox360;
	
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 2, max = 50, message = "O nome deve ter de 2 à 50 caracteres")
	private String nintendo;
	
	@ManyToOne
	@JsonIgnoreProperties("categorias")
	private Produtos produtos;
	
	@ManyToOne
	@JsonIgnoreProperties("categorias")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPs4() {
		return ps4;
	}

	public void setPs4(String ps4) {
		this.ps4 = ps4;
	}

	public String getXbox360() {
		return xbox360;
	}

	public void setXbox360(String xbox360) {
		this.xbox360 = xbox360;
	}

	public String getNintendo() {
		return nintendo;
	}

	public void setNintendo(String nintendo) {
		this.nintendo = nintendo;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
}