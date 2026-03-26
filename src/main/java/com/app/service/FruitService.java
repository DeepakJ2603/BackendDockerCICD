package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Fruit;
import com.app.repository.FruitRepository;

@Service
public class FruitService {
	
	@Autowired
	private FruitRepository fruitRepository;
	
	public List<Fruit> getFruits(){
		return fruitRepository.findAll();
	}

	public String addFruit(Fruit fruit) {
		fruitRepository.save(fruit);
		return "<h1>Fruit Saved!!</h1>";
	}
}
