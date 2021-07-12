package com.api.marvel.controllers;

import java.net.URI;

import javax.validation.Valid;

import com.api.marvel.requests.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.marvel.dto.UsuarioDto;
import com.api.marvel.entities.Usuario;
import com.api.marvel.services.ConverterDto;
import com.api.marvel.services.UsuarioServiceInsert;

@RestController
public class UsuarioControllerInsert {

	@Autowired
	private UsuarioServiceInsert service;
	
	private ConverterDto dto;
	
	@PostMapping(value = "/usuarios")
	public ResponseEntity<Void> insert(@Valid @RequestBody UsuarioRequest objDto){
		Usuario usuario = objDto.toModel();

		usuario = service.insert(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
}
