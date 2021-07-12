package com.api.marvel.controllers;

import com.api.marvel.dto.UsuarioComicsDTOResponse;
import com.api.marvel.requests.UsuarioRevistasRequest;
import com.api.marvel.services.ListaUsuarioComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaRevistasUsuarioController {

    @Autowired
    private ListaUsuarioComicsService service;

    @PostMapping("/usuario-comics")
    public UsuarioComicsDTOResponse teste(@RequestBody UsuarioRevistasRequest usuarioRevistas) {
        return this.service.listaComicsDoUsuario(usuarioRevistas.getIdUsuario(), usuarioRevistas.getIdComics());
    }
}
