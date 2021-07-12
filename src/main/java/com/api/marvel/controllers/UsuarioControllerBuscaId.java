package com.api.marvel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Usuario;
import com.api.marvel.services.UsuarioServiceBuscaId;

@RestController
public class UsuarioControllerBuscaId {
	
	@Autowired
	private UsuarioServiceBuscaId service;
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> busca(@PathVariable Long id){
		Usuario obj = service.busca(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
