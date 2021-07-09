package com.api.marvel.dto;

import com.api.marvel.dto.marvel.Comic;
import com.api.marvel.dto.marvel.ComicPrice;
import com.api.marvel.dto.marvel.CreatorList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComicsDto {
	
	private Integer id;
	private String title;
	private Float price;
	private String creators;
	private String isbn;
	private String description;
	
	public ComicsDto() {
	}
	
	public ComicsDto(Comic obj, ComicPrice prices, CreatorList creator) {
		id = obj.getId();
		title = obj.getTitle();
		price = prices.getPrice();
		creators = creator.getCollectionURI();
		isbn = obj.getIsbn();
		description = obj.getDescription();
	}
	
	
	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Float getPrice() {
		return price;
	}

	public String getCreator() {
		return creators;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getDescription() {
		return description;
	}

	public void converteJson(ObjectMapper mapper, String json) throws JsonProcessingException {
		 try {
			mapper.readValue(json, getClass()).getId();
		} catch (JsonMappingException e) {
			e.printStackTrace();
			System.out.println("Erro ao pegar status da solicitação da proposta");
		}
		 
}
}
