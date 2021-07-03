package com.api.marvel.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.marvel.dto.ComicsDto;
import com.api.marvel.entities.Comics;
import com.api.marvel.repositories.ComicsRepository;
import com.api.marvel.services.ComicsService;

@RestController
public class ComicsController {

	@Autowired
	private ComicsRepository comicsRepository;
	
	@Autowired
	private ComicsService service;
	
	@RequestMapping("/comics")
	public ResponseEntity<List<Comics>> listar(){
		List<Comics> lista = comicsRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@PostMapping("/comics")
	public ResponseEntity<Void> insert(@Valid @RequestBody ComicsDto objDto){
		Comics comics = service.fromDTO(objDto);
		comics = service.insert(comics);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(comics.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
	
}
