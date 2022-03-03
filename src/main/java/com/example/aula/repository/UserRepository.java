package com.example.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}