package com.api.marvel.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.marvel.dto.ComicsDto;
import com.api.marvel.dto.marvel.Comic;
import com.api.marvel.dto.marvel.ComicDataWrapper;
import com.api.marvel.entities.Comics;
import com.api.marvel.services.ComicInsert;
import com.api.marvel.services.ComicsServiceBuscaId;
import com.api.marvel.services.ConverterDto;

@RestController
public class ComicsController{
	
	@Autowired
	private ComicsServiceBuscaId service;
	
	@Autowired
	private ComicInsert insert;
	
	@Autowired
	private ConverterDto dto;
	
	@RequestMapping(value = "comics/{id}", method = RequestMethod.GET)
	public ResponseEntity<ComicDataWrapper> buscar(@PathVariable Integer id){
		ComicDataWrapper obj = this.service.buscarId(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping("comics/{id}")
	public ResponseEntity<Void> insert(@Valid @RequestBody ComicsDto objDto){
		Comics comics = dto.fromDTO(objDto);
		
		comics = insert.insert(comics);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(comics.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
	
	
}
