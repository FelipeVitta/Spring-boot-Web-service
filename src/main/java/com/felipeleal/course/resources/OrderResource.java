package com.felipeleal.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeleal.course.entities.Order;
import com.felipeleal.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")   //suporta os métodos Post, Get, Put, Delete e Pacth
public class OrderResource {
	
	//dependencia para o Service
	@Autowired
	private OrderService service;
	
	@GetMapping //significa que responde a requesição do tipo get
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	//PathVariable faz com que o "Long id" é considerado aquele que chegou pela url do /id
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}