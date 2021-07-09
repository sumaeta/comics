package com.api.marvel.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MarvelDto {
	
	

	    
		public void converteJson(ObjectMapper mapper, String json) throws JsonProcessingException {
			 try {
				mapper.readValue(json, MarvelDto.class);
			} catch (JsonMappingException e) {
				e.printStackTrace();
				System.out.println("Erro em converter para json");
			 
			}
		}
    
}
		