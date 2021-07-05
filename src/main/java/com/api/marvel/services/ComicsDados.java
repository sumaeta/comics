package com.api.marvel.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.api.marvel.entities.Comics;

@FeignClient(name = "comics", url = "https://gateway.marvel.com/v1/public/comics?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a")
public interface ComicsDados {

	@RequestMapping(method = RequestMethod.GET, value = "")
    Comics getComics();	
	
}
