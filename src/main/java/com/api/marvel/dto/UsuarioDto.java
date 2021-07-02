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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
