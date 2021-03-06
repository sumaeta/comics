package com.api.marvel.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "comics")
public class Comics implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("comics_id")
	private Integer comicId;
	@JsonProperty("titulo")
	private String title;
	@JsonProperty("preco")
	private Float price;
	private String autores;
	private String isbn;

	@Column(length = 100000)
//	@Length(min = 5, max = 255, message = "Minimo deve ser 5 caracteres e o máximo deve ser 255 caracteres")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	
	public Comics() {
	}

	public Comics(int comicId, String title, Float price, String autores, String isbn, String descricao) {
		this.comicId = comicId;
		this.title = title;
		this.price = price;
		this.autores = autores;
		this.isbn = isbn;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getComicId() {
		return comicId;
	}

	public void setComicsId(int comicsId) {
		this.comicId = comicsId;
	}

	public String getTitulo() {
		return title;
	}

	public void setTitulo(String titulo) {
		this.title = titulo;
	}

	public Float getPreco() {
		return price;
	}

	public void setPreco(Float preco) {
		this.price = preco;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comics other = (Comics) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comics [id=" + id + ", comicId=" + comicId + ", title=" + title + ", price=" + price + ", autores="
				+ autores + ", isbn=" + isbn + ", descricao=" + descricao + ", usuario=" + usuario + "]";
	}
	
	
	
	
}
