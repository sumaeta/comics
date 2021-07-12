package com.api.marvel.dto;

import com.api.marvel.entities.Usuario;

public class UsuarioDTOResponse {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;

    public UsuarioDTOResponse(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.dataNascimento = usuario.getDataNascimento();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
