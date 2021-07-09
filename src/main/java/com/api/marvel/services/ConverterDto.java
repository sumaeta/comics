package com.api.marvel.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.api.marvel.dto.ComicsDto;
import com.api.marvel.dto.marvel.Comic;
import com.api.marvel.dto.marvel.ComicPrice;
import com.api.marvel.dto.marvel.CreatorList;
import com.api.marvel.entities.Comics;

@Service
public class ConverterDto {

	public Comics fromDTO(@Valid Comic objDto, ComicPrice prices, CreatorList creator) {
		return new Comics(objDto.getId(), objDto.getTitle(), prices.getPrice(), creator.getCollectionURI(), objDto.getIsbn(), objDto.getDescription());
}

	public Comics fromDTO(@Valid ComicsDto objDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
