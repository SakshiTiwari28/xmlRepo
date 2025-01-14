package com.zensar.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

@RestController
@RequestMapping("/product")
public class Resource {
	
	@Autowired
  private ProductService service;
	
	@GetMapping
		public List<Product> getAllProducts(){
		return service.findAllProducts();
		
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Integer ProductId) {
		return service.findProductById(ProductId);
	}
	
	@PostMapping
	public String createProduct(@RequestParam("id") int productId, @RequestParam("name") String name,
			@RequestParam("brand") String brand, @RequestParam("price") float price) {
		Product product = new Product(productId, name, brand, price);
		service.create(product);
		return "Product " + productId + "created successfully";
	}
	
	@PutMapping
	public String editProduct(@RequestBody Product product) {
		
		service.edit(product);
		return "Product " +product.getProductId() + " edited Successfully";
	}
	
	@DeleteMapping
	public String removeProduct(@RequestBody Product product) {
		service.remove(product);
		return "Product " +product.getProductId() + "product Deleted";
	}
	
	@GetMapping("/count")
	public int getProductCount() {
		return service.findAllProducts().size();
	}
}	
	


