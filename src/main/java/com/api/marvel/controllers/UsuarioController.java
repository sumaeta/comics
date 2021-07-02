package com.api.marvel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping("/usuarios")
	public ResponseEntity<List<Usuario>> lista(){
		List<Usuario> lista = usuarioRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	
}
