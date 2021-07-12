package com.api.marvel.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComicRequest {

    @JsonProperty("id_comic")
    private Integer idComic;

    public Integer getIdComic() {
        return idComic;
    }
}
