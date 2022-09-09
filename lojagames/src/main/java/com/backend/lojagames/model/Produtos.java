package com.backend.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O Tema é obrigatório")
	private String desenho;
	
	@NotNull(message = "O Tema é obrigatório")
	private String gerra;
	
	@NotNull(message = "O Tema é obrigatório")
	private String fantasia;
	
	@OneToMany(mappedBy = "produtos", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("produtos")
	private List<Categorias> categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesenho() {
		return desenho;
	}

	public void setDesenho(String desenho) {
		this.desenho = desenho;
	}

	public String getGerra() {
		return gerra;
	}

	public void setGerra(String gerra) {
		this.gerra = gerra;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public List<Categorias> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categorias> categorias) {
		this.categorias = categorias;
	}
}