package com.api.marvel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Usuario;
import com.api.marvel.services.UsuarioServiceListar;

@RestController
public class UsuarioControllerListar {

	@Autowired
	private UsuarioServiceListar service;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> lista(){
		List<Usuario> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
