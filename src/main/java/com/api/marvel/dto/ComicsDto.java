package com.api.marvel.dto;

import com.api.marvel.dto.marvel.Comic;
import com.api.marvel.dto.marvel.ComicPrice;
import com.api.marvel.dto.marvel.CreatorList;

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
		 
}

