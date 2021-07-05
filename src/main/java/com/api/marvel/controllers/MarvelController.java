package com.api.marvel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Comics;
import com.api.marvel.services.ComicsDados;

@RestController
@RequestMapping("dados")
public class MarvelController{
	
	@Autowired
	private ComicsDados dados;
	
	@RequestMapping(method = RequestMethod.GET, value = "" )
	public Comics getDados(){
		return dados.getComics();
	}
	
	/*
	RestTemplate template;
	Comics id;
	
	@Autowired
	
	@GetMapping("/allDados")
	public List<ComicsDto> getAllDados(){
		return dados.getAllComics();
	}
	
	
	@GetMapping("/comics/{id}")
	public ResponseEntity<ComicsDto> comics(){
		String path = ApiKey.class.toString();
		ComicsDto comics = template.exchange(path,HttpMethod.GET,
				null, 
				new ParameterizedTypeReference<ComicsDto>() {})
				.getBody();
		return ResponseEntity.ok().body(comics);
	}
	
	
	@GetMapping("/")
	public Comics getComics() {
		return dados.getComics();
	}
	*/
}
