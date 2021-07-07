package com.api.marvel.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.api.marvel.dto.ComicsDto;

@FeignClient(name = "dados", url = "https://gateway.marvel.com/v1/public/comics/2?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a")
public interface ComicsDados {

	@RequestMapping(method = RequestMethod.POST, value = "/comics/{id}?ts=1625417799&apikey=cd5e3408e8d647534f2c202635620ba9&hash=f8353910e6768293edb183c8cbd0803a")
    public List<ComicsDto> lista(@PathVariable("id")String id);
	
	
}
