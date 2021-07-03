package com.api.marvel.dto;

import com.api.marvel.entities.Comics;

public class ComicsDto {

	private String comicsId;
	private String titulo;
	private Double preco;
	private String autores;
	private Integer isbn;
	private String descricao;
	
	public ComicsDto() {
		super();
	}
	public ComicsDto(Comics obj) {
		super();
		comicsId = obj.getComicsId();
		titulo = obj.getTitulo();
		preco = obj.getPreco();
		autores = obj.getAutores();
		isbn = obj.getIsbn();
		descricao = obj.getDescricao();
	}
	public String getComicsId() {
		return comicsId;
	}
	public void setComicsId(String comicsId) {
		this.comicsId = comicsId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
