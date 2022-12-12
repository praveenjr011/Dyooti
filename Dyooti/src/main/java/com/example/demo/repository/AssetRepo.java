package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Asset;

public interface AssetRepo extends JpaRepository<Asset, Integer> {

}
