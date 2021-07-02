package com.api.marvel.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.marvel.dto.UsuarioDto;
import com.api.marvel.entities.Usuario;
import com.api.marvel.services.UsuarioService;

@RestController
public class UsuarioController {

	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> lista(){
		List<Usuario> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@PostMapping("usuarios/{id}")
	public ResponseEntity<Void> insert(@Valid @RequestBody UsuarioDto objDto){
		Usuario usuario = service.fromDTO(objDto);
		usuario = service.insert(usuario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
	
	
}
