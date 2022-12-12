package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asset_info")
public class Asset {
	@Id
	private int asset_id;
	private String AssetType;
	private String SerialNumber;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "c_id")
	private Category assetDet;

	public Asset(int asset_id, String assetType, String serialNumber, Category asset_det) {
		super();
		this.asset_id = asset_id;
		AssetType = assetType;
		SerialNumber = serialNumber;
		this.assetDet = asset_det;
	}

	Asset() {

	}

	public int getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}

	public String getAssetType() {
		return AssetType;
	}

	public void setAssetType(String assetType) {
		AssetType = assetType;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public Category getAssetDet() {
		return assetDet;
	}

	public void setAssetDet(Category assetDet) {
		this.assetDet = assetDet;
	}

	@Override
	public String toString() {
		return "Asset [asset_id=" + asset_id + ", AssetType=" + AssetType + ", SerialNumber=" + SerialNumber
				+ ", assetDet=" + assetDet + "]";
	}

}
