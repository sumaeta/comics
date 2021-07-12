package com.api.marvel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.dto.UsuarioDto;
import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.UsuarioRepository;
import com.api.marvel.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioServiceListar {

	@Autowired
	private UsuarioRepository repository;

	//buscando todos os usuarios
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
}
