package com.api.marvel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.UsuarioRepository;
import com.api.marvel.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioServiceBuscaId {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario busca(Long id) {
		 Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
		} 
	
	
}
