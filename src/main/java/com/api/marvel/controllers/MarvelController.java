package com.api.marvel.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarvelController {
	
	
	/*
	@GetMapping("/dados")
	public ResponseEntity<ComicsDto> comics() {
		
		HttpHeaders headers = new HttpHeaders();
		
        headers.setContentType(MediaType.APPLICATION_JSON);
        
		
		RestTemplate restTemplate = new RestTemplate();	
		
		ComicsDto modelos = restTemplate.getForObject("https://gateway.marvel.com/v1/public/comics?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a", 
				ComicsDto.class);
		
		return ResponseEntity.ok().body(modelos);
	}
*/
	
	/*
	@GetMapping(value = "/modelos")
	public MarvelDto getComics() {
		String path = "https://gateway.marvel.com/v1/public/comics?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a";
		
		MarvelDto modelos = restTemplate.exchange(path,HttpMethod.GET, null, 
				new ParameterizedTypeReferenceMarvelDto(){}).getBody();
		
		return modelos;
		
		List<MarvelDto> comics = restTemplate.exchange(path,
				HttpMethod.GET, 
				entity, 
		new ParameterizedTypeReference<List<MarvelDto>>() {}).getBody();
	}
	*/
}
