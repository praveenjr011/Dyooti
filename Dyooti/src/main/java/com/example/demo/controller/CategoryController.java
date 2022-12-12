package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepo;

@RestController
public class CategoryController {
	@Autowired
	CategoryRepo categoryRepo;

	private final CategoryRepo repository;

	CategoryController(CategoryRepo repository) {
		this.repository = repository;
	}

	@GetMapping("/Category")
	List<Category> all() {
		return repository.findAll();
	}

	@PostMapping("/Category")
	Category newCategory(@RequestBody Category newCategory) {
		return repository.save(newCategory);
	}

	@GetMapping("/Category/{type}")

	Optional<Category> one(@PathVariable String type) {

		return repository.findByType(type);

	}

}
