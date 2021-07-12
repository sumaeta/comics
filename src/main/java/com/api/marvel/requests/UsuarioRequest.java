package com.api.marvel.requests;

import com.api.marvel.entities.Usuario;

public class UsuarioRequest {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;

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

    public Usuario toModel() {
        return new Usuario(id, nome, email, cpf, dataNascimento);
    }
}
