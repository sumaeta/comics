package com.api.marvel.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.api.marvel.dto.ComicsDto;
import com.api.marvel.dto.UsuarioDto;
import com.api.marvel.dto.marvel.MarvelDto;
import com.api.marvel.entities.Comics;
import com.api.marvel.entities.Usuario;

@Service
public class ConverterDto {

	public Comics fromDTOMarvel(@Valid MarvelDto objDto ) {
		return new Comics(objDto.getId(), objDto.getTitle(), objDto.getPrice(), objDto.getCreator(), objDto.getIsbn(), objDto.getDescription());
}
	
	public Comics fromDTO(@Valid ComicsDto objDto) {
		return null;
	}
}
