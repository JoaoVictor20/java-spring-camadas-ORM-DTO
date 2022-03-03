package com.example.aula.dto;

import com.example.aula.entities.User;

public class UserDto {
	
	private Long id;
	private String nome;
	
	public UserDto() {
		
	}

	public UserDto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public UserDto(User user) {
		this.id = user.getId();
		this.nome = user.getName();
	}
}