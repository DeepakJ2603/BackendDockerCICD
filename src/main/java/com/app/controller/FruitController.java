package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Fruit;
import com.app.service.FruitService;


@RestController
@RequestMapping("api/fruit")
public class FruitController {
	
	@Autowired
	private FruitService fruitService;
	
	
	@GetMapping
	public List<Fruit> getFruits() {
		return fruitService.getFruits();
	}
	
	@PostMapping
	public String addFruit(@RequestBody Fruit fruit) {
		return fruitService.addFruit(fruit);
	}
	
	
}
