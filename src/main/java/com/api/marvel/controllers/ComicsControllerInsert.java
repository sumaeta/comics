package com.api.marvel.controllers;

import javax.validation.Valid;

import com.api.marvel.requests.ComicRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Comics;
import com.api.marvel.services.ComicInsert;
import com.api.marvel.services.ConverterDto;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class ComicsControllerInsert {

	@Autowired
	private ComicInsert insert;
	
	@Autowired
	private ConverterDto dto;
	
	@PostMapping("comics")
	public ResponseEntity<Comics> insert(@Valid @RequestBody ComicRequest objDto){
		Comics comics = insert.save(objDto.getIdComic());

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(comics.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
}
