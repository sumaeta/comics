package com.api.marvel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.entities.Comics;
import com.api.marvel.repositories.ComicsRepository;

@Service
public class ComicInsert {

	@Autowired
	private ComicsRepository repo;
	
	//insere quando o id é nulo
	public Comics insert(Comics obj) {
			obj.setId(null);				
			return repo.save(obj);
		}
}
