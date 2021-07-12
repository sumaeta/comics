package com.api.marvel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.UsuarioRepository;

@Service
public class UsuarioServiceInsert {

	@Autowired
	public UsuarioRepository repository;
	
	//inserindo usuario
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
	}
	
}
