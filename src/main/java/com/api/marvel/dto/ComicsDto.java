package com.api.marvel.dto;

import java.io.Serializable;

import com.api.marvel.entities.Comics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComicsDto implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("price")
	private Double price;
	
	@JsonProperty("creator")
	private String creator;
	
	@JsonProperty("isbn")
	private String isbn;
	
	@JsonProperty("description")
	private String description;
	
	public ComicsDto() {
	}
	
	public ComicsDto(Comics obj) {
		super();
		id = obj.getComicsId();
		creator = obj.getTitulo();
		price = obj.getPreco();
		creator = obj.getAutores();
		isbn = obj.getIsbn();
		description = obj.getDescricao();
	}
	
	public int getComicsId() {
		return id;
	}
	
	public void setComicsIdd(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return creator;
	}
	
	public void setTitulo(String titulo) {
		this.creator = titulo;
	}
	
	public Double getPreco() {
		return price;
	}
	
	public void setPreco(Double preco) {
		this.price = preco;
	}
	
	public String getAutores() {
		return creator;
	}
	
	public void setAutores(String autores) {
		this.creator = autores;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getDescricao() {
		return description;
	}
	
	public void setDescricao(String descricao) {
		this.description = descricao;
	}
	
	public void converteJson(ObjectMapper mapper, String json) throws JsonProcessingException {
		 try {
			mapper.readValue(json, getClass()).getComicsId();
		} catch (JsonMappingException e) {
			e.printStackTrace();
			System.out.println("Erro ao pegar status da solicitação da proposta");
		}
}
}
