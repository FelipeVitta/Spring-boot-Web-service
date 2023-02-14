package com.felipeleal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeleal.course.entities.Category;
import com.felipeleal.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		//repassando a chamada para o repository (dependencia)
		return repository.findAll();
	}
	
	public Category findById(Long id) {
	  Optional<Category> obj = repository.findById(id);
	  return obj.get();
	}
	
	
}