package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 *  Author:Sakshi Tiwari
 *  Date: 25th Jul 2019 5.55AM
 *  Modified Date: 26th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: Represents business entity product.
 *  It is persistent class of Hibernate , value object of application,
 *  domain or application object. It is also POJO.
 */

@XmlRootElement
@XmlType(propOrder = {"productId","name","brand","price"})
@Entity
@Table(name="PRODUCT")
public class Product {
  
	@Id
	//@GeneratedValue
	@Column(name="ID")
	private int productId;
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	private String name;
	private String brand;
	private float price;
	
	public Product(){
		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
