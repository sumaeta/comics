package com.api.marvel.dto;

import com.api.marvel.dto.marvel.Comic;
import com.api.marvel.entities.Comics;

import java.util.Calendar;

public class ComicDTOResponse {
    private Long id;
    private String title;
    private Float price;
    private String creators;
    private String isbn;
    private String description;
    private String diaDesconto;
    private boolean descontoAtivo = false;

    public ComicDTOResponse(Comics comic) {
        this.id = comic.getId();
        this.title = comic.getTitulo();
        this.price = comic.getPreco();
        this.creators = comic.getAutores();
        this.isbn = comic.getIsbn();
        this.description = comic.getDescricao();
        this.diaDesconto = diaDesconto;
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

    /*
    public String isDiaDesconto() {
        int i = Integer.parseInt(isbn.substring(isbn.length()-1));
        if (i == 0 || i == 1) {
            return "segunda";
        } else if (i == 2 || i == 3) {
            return "terca";
        } else if (i == 4 || i == 5) {
            return "quarta";
        } else if (i == 6 || i == 7) {
            return "quinta";
        } else if (i == 8 || i == 9) {
            return "sexta";
        }
        return diaDesconto;
    }

    public boolean isDescontoAtivo() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        String numeroFinal = isbn.substring(isbn.length()-1);
        int i = Integer.parseInt(numeroFinal);

        if(day == i){
            return true;
        }

        return descontoAtivo;
    }
    /*
    public String toDiaSemana(String isbn) {
        int i = Integer.parseInt(isbn.substring(isbn.length()-1));
        if (i == 0 || i == 1) {
            return "segunda";
        } else if (i == 2 || i == 3) {
            return "terca";
        } else if (i == 4 || i == 5) {
            return "quarta";
        } else if (i == 6 || i == 7) {
            return "quinta";
        } else if (i == 8 || i == 9) {
            return "sexta";
        }
        return "Dia não encontrado";
    }
    /*
    public float toPrice(){
        if(descontoAtivo == true) {
            float preco = (price * 10) / 100;
            float newPrice = preco - price;
            return newPrice;
        }
        return getPrice();
    }
    */

}
