package com.felipeleal.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeleal.course.entities.Product;
import com.felipeleal.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")   //suporta os métodos Post, Get, Put, Delete e Pacth
public class ProductResource {
	
	//dependencia para o Service
	@Autowired
	private ProductService service;
	
	@GetMapping //significa que responde a requesição do tipo get
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	//PathVariable faz com que o "Long id" é considerado aquele que chegou pela url do /id
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
