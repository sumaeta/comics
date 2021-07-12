package com.api.marvel.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsuarioComicsRequest {

    @JsonProperty("id_usuario")
    private Long idUsuario;

    @JsonProperty("id_comics")
    private List<Integer> idComics;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public List<Integer> getIdComics() {
        return idComics;
    }
}
