package com.api.marvel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.marvel.ComicDataWrapper;
import com.api.marvel.services.ComicsService;

@RestController
public class ComicsController{
	
	@Autowired
	private ComicsService service;
	
	@RequestMapping(value = "teste", method = RequestMethod.GET)
    public ResponseEntity<ComicDataWrapper> listar() {
        ComicDataWrapper response = service.qualquerCoisa();
        
        return ResponseEntity.ok(response);
    }
	
	
	/*
	 * 
	 * @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
			Cliente obj = service.find(id);
			return ResponseEntity.ok().body(obj);
	}
	 
	@GetMapping("/comics")
	public ResponseEntity<List<Comics>> listar(){
		List<Comics> lista = comicsRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	
	/*
	@PostMapping("/comics")
	public ResponseEntity<Void> insert(@Valid @RequestBody ComicsDto objDto){
		Comics comics = service.fromDTO(objDto);
		comics = service.insert(comics);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(comics.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
	*/
	
}
