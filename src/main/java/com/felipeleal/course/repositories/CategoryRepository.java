package com.felipeleal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeleal.course.entities.Category;

//JPARepository<tipo da entidade, tipo do id da entidade>//
//JPA já tem uma implementação padrão para essa interface

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
