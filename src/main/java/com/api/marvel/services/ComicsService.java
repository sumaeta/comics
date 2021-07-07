package com.api.marvel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.dto.ComicsDto;
import com.api.marvel.entities.Comics;
import com.api.marvel.repositories.ComicsRepository;

@Service
public class ComicsService {

	@Autowired
	private ComicsRepository repository;
	
	public Comics insert(Comics obj) {
		return repository.save(obj);
	}
	
	
	//tranformando de usuariodto pra usuario
		public Comics fromDTO(ComicsDto objDto) {
			return new Comics(objDto.getComicsId(), objDto.getTitulo(), objDto.getPreco(), objDto.getAutores(), objDto.getIsbn(), objDto.getDescricao());
		}

		
		public Comics busca(Long id){
			Comics obj = repository.getById(id);
			return obj;
		}


	
}
