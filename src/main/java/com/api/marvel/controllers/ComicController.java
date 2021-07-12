package com.api.marvel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.dto.marvel.ComicDataWrapper;
import com.api.marvel.services.ComicServiceBuscaId;

@RestController
public class ComicController {
	
	@Autowired
	private ComicServiceBuscaId service;
	
	@RequestMapping(value = "comics/{id}", method = RequestMethod.GET)
	public ResponseEntity<ComicDataWrapper> buscar(@PathVariable Integer id){
		ComicDataWrapper obj = this.service.buscarId(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
}
