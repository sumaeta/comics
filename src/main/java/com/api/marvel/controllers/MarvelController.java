package com.api.marvel.controllers;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.marvel.dto.ComicsDto;

@RestController
public class MarvelController {

	RestTemplate template;
	
	@GetMapping
	public ResponseEntity<List<ComicsDto>> comics(){
		String path = "https://gateway.marvel.com/v1/public/comics?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a";
		List<ComicsDto> comics = template.exchange(path,HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<List<ComicsDto>>() {})
				.getBody();
		
		return ResponseEntity.ok().body(comics);
	}
	
	
	
}
