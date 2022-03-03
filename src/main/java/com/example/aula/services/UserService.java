package com.example.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.dto.UserDto;
import com.example.aula.entities.User;
import com.example.aula.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto findById(Long id) {
		User user = userRepository.findById(id).get();
		UserDto userDto = new UserDto(user);
		return userDto;
	}
}