package com.service.security;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
	
	@Autowired
	private AnimalR an;

	@GetMapping("animals")
	List<Animal> animals() {
		return an.findAll();
	}
	
	@GetMapping("animals/{id}")
	Optional<Animal> animal(Double id) {
		Optional<Animal> animal= an.findById(id);
		return animal;
	}
	
	@PostMapping("add")
	Animal add(@RequestParam String nom, @RequestParam String sexe, @RequestParam int qte){
		Animal a= new Animal(nom,sexe,qte);
		return an.save(a);
	}
}
