package com.api.marvel.dto;

import com.api.marvel.entities.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	
	public UsuarioDto() {
	}
	
	public UsuarioDto(Usuario objDto) {
		id = objDto.getId();
		nome = objDto.getNome();
		email = objDto.getEmail();
		cpf = objDto.getCpf();
		dataNascimento = objDto.getDataNascimento();
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

	public Long getId() {
		return id;
	}


	
}
