package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	@JsonIgnore
	@OneToMany(mappedBy = "asset_id")
	private List<Asset> asset;

	public Category(int id, String type, List<Asset> asset) {
		super();
		this.id = id;
		this.type = type;
		this.asset = asset;
	}

	public Category() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Asset> getAsset() {
		return asset;
	}

	public void setAsset(List<Asset> asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + ", asset=" + asset + "]";
	}
}
