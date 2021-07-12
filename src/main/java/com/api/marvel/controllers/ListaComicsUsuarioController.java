package com.api.marvel.controllers;

import com.api.marvel.dto.UsuarioComicsDTOResponse;
import com.api.marvel.requests.UsuarioComicsRequest;
import com.api.marvel.services.ListaUsuarioComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaComicsUsuarioController {

    @Autowired
    private ListaUsuarioComicsService service;

    @PostMapping("/usuario-comics")
    public UsuarioComicsDTOResponse teste(@RequestBody UsuarioComicsRequest usuarioComics) {
        return this.service.listaComicsDoUsuario(usuarioComics.getIdUsuario(), usuarioComics.getIdComics());
    }
}
