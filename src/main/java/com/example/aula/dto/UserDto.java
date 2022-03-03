package com.example.aula.dto;

import com.example.aula.entities.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private Long id;
	private String nome;
	
	public UserDto(User user) {
		this.id = user.getId();
		this.nome = user.getName();
	}
}