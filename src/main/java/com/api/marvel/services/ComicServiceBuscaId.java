package com.api.marvel.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.api.marvel.dto.marvel.ComicDataWrapper;


@Service
public class ComicServiceBuscaId {

	@Value("${marvel.privatekey}")
	private String chavePrivada;
	
	@Value("${marvel.publickey}")
	private String chavePublica;
	
	 public ComicDataWrapper buscarId(@PathVariable Integer id) {
		 
         RestTemplate client = new RestTemplate();

         HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);

         HttpEntity<?> request = new HttpEntity<>(null, headers);
     
     Long time = System.currentTimeMillis();
     
     String chaves = time + chavePrivada + chavePublica;

         String hash = DigestUtils.md5DigestAsHex(chaves.getBytes());
     

     ResponseEntity<ComicDataWrapper> response = client.exchange(
             "http://gateway.marvel.com/v1/public/comics"+"/" + id +"?ts="+time+"&apikey="+chavePublica+"&hash="+hash,
             HttpMethod.GET,
             request,
             ComicDataWrapper.class
     );

     return response.getBody();
}

}
