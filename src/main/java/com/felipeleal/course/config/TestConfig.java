package com.felipeleal.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipeleal.course.entities.Order;
import com.felipeleal.course.entities.User;
import com.felipeleal.course.repositories.OrderRepository;
import com.felipeleal.course.repositories.UserRepository;

//classe auxiliar para fazer algumas configurações na aplicação

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//spring associa uma instancia de UserRepository aqui
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
				
		User u1 = new User(null, "Arthur Cabral", "arthur@gmail.com","98888888", "12345");
		User u2 = new User(null, "Marcelo Ferreira", "marcelo@gmail.com","98866848", "345676");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
				
		
	}
	
	
}
