package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer>{
	
}
