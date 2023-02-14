package com.felipeleal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeleal.course.entities.Product;
import com.felipeleal.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		//repassando a chamada para o repository (dependencia)
		return repository.findAll();
	}
	
	public Product findById(Long id) {
	  Optional<Product> obj = repository.findById(id);
	  return obj.get();
	}
	
	
}