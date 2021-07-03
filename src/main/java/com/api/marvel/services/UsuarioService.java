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
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	//inserindo usuario
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
	}
	
	//buscando todos os usuarios
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Usuario busca(Long id) {
		 Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
		} 
	
	//tranformando de usuariodto pra usuario
	public Usuario fromDTO(UsuarioDto objDto) {
		return new Usuario(objDto.getId(), objDto.getNome(), objDto.getEmail(), objDto.getCpf(), objDto.getDataNascimento());
	}
}
