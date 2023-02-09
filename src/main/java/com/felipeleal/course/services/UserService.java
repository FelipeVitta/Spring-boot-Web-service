package com.felipeleal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeleal.course.entities.User;
import com.felipeleal.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		//repassando a chamada para o repository
		return repository.findAll();
	}
	
	public User findById(Long id) {
	  Optional<User> obj = repository.findById(id);
	  return obj.get();
	}
		
}
