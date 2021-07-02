package com.api.marvel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.entities.Comics;
import com.api.marvel.repositories.ComicsRepository;

@RestController
public class ComicsController {

	@Autowired
	private ComicsRepository comicsRepository;
	
	@RequestMapping("/comics")
	public ResponseEntity<List<Comics>> lista(){
		List<Comics> lista = comicsRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
