package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Asset;
import com.example.demo.repository.AssetRepo;
import com.example.demo.repository.CategoryRepo;

@RestController
public class AssetController {

	@Autowired
	CategoryRepo categoryRepo;

	@Autowired
	AssetRepo assetRepo;
	private final AssetRepo repository;

	AssetController(AssetRepo repository) {
		this.repository = repository;
	}

	@GetMapping("/asset")
	List<Asset> all() {
		return repository.findAll();
	}

	@PostMapping("/addasset")
	Asset newAsset(@RequestBody Asset newAsset) {
		return repository.save(newAsset);
	}

	@GetMapping("/asset/{id}")

	Optional<Asset> one(@PathVariable Integer id) {

		return repository.findById(id);

	}

}
