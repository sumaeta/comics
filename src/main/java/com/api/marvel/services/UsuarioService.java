package com.api.marvel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario insert(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}
}
