package com.productms.model;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "producto", schema = "productoms")
public class Producto {
	private @Id @GeneratedValue Long id; 
	private String name;
	private String description;
	private float price ;
	private String pictureFileName;
	private int catalogType ;
	private int catalogBrand ;
	private int availableStock ;
	private int restockThreshold;
	private int maxStockThreshold;
	private boolean onreorder;
	public Producto(Long id, String name, String description, float price, String pictureFileName, int catalogType,
			int catalogBrand, int availableStock, int restockThreshold, int maxStockThreshold, boolean onreorder) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.pictureFileName = pictureFileName;
		this.catalogType = catalogType;
		this.catalogBrand = catalogBrand;
		this.availableStock = availableStock;
		this.restockThreshold = restockThreshold;
		this.maxStockThreshold = maxStockThreshold;
		this.onreorder = onreorder;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	 @Basic
	 @Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 @Basic
	 @Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 @Basic
	 @Column(name = "PRICE")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Basic
	@Column(name = "PICTUREFILENAME")
	public String getPictureFileName() {
		return pictureFileName;
	}
	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}
	 @Basic
	 @Column(name = "CATALOGTYPE")
	public int getCatalogType() {
		return catalogType;
	}
	public void setCatalogType(int catalogType) {
		this.catalogType = catalogType;
	}

	@Basic
	@Column(name = "CATALOGBRAND")
	public int getCatalogBrand() {
		return catalogBrand;
	}
	public void setCatalogBrand(int catalogBrand) {
		this.catalogBrand = catalogBrand;
	}

	@Basic
	@Column(name = "AVAILABLESTOCK")
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	
	@Basic
	@Column(name = "RESTOCKTHRESHOLD")
	public int getRestockThreshold() {
		return restockThreshold;
	}
	public void setRestockThreshold(int restockThreshold) {
		this.restockThreshold = restockThreshold;
	}
	@Basic
	@Column(name = "CATALOGTYPE")
	public int getMaxStockThreshold() {
		return maxStockThreshold;
	}
	public void setMaxStockThreshold(int maxStockThreshold) {
		this.maxStockThreshold = maxStockThreshold;
	}
	
	@Basic
	@Column(name = "ONREORDER")
	public boolean isOnreorder() {
		return onreorder;
	}
	public void setOnreorder(boolean onreorder) {
		this.onreorder = onreorder;
	}

	
	
}
