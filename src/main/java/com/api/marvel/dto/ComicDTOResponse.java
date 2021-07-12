package com.api.marvel.dto;

import com.api.marvel.entities.Comics;

public class ComicDTOResponse {
    private Long id;
    private String title;
    private Float price;
    private String creators;
    private String isbn;
    private String description;
    private String diaDesconto;
    private boolean descontoAtivo;

    public ComicDTOResponse(Comics comic) {
        this.id = comic.getId();
        this.title = comic.getTitulo();
        this.price = comic.getPreco();
        this.creators = comic.getAutores();
        this.isbn = comic.getIsbn();
        this.description = comic.getDescricao();
        this.diaDesconto = toDiaSemana(comic.getIsbn()) ;
        this.descontoAtivo = descontoAtivo;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getPrice() {
        return price;
    }

    public String getCreators() {
        return creators;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public String getDiaDesconto() {
        return diaDesconto;
    }

    public boolean isDescontoAtivo() {
        return descontoAtivo;
    }

    private String toDiaSemana(String isbn) {
        return "";
    }

    public String paga(String isbn){

        String numeroFinal = getIsbn();
        int i = Integer.parseInt(numeroFinal);

        if(i == 0 || i == 1) {
            return "Segunda";
        }

        if(i == 2 || i == 3) {
            return "Terca";
        }
        if(i == 4 || i == 5) {
            return "Quarta";
        }
        if(i == 6 || i == 7) {
            return "Quinta";
        }
        if(i == 8 || i == 9) {
            return "Sexta";
        }
        return "";
    }
}
