package com.api.marvel.dto;

import java.util.List;

public class UsuarioComicsDTOResponse {

    private UsuarioDTOResponse usuario;
    private List<ComicDTOResponse> comics;

    public UsuarioComicsDTOResponse(UsuarioDTOResponse usuario, List<ComicDTOResponse> comics) {
        this.usuario = usuario;
        this.comics = comics;
    }

    public UsuarioDTOResponse getUsuario() {
        return usuario;
    }

    public List<ComicDTOResponse> getComics() {
        return comics;
    }
}
