package com.felipeleal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeleal.course.entities.Order;
import com.felipeleal.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		//repassando a chamada para o repository (dependencia)
		return repository.findAll();
	}
	
	public Order findById(Long id) {
	  Optional<Order> obj = repository.findById(id);
	  return obj.get();
	}
	
	
}