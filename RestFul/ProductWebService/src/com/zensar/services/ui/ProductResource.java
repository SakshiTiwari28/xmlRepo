package com.zensar.services.ui;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zensar.entities.Product;
import com.zensar.service.business.ProductService;
import com.zensar.service.business.ProductServiceImplementor;

/*
 *  Author:Sakshi Tiwari
 *  Date: 26th Jul 2019 5.55AM
 *  Modified Date: 26th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description:Product web service.
 *  It provides product data through RestFul Web Service.
 */
@Path("/product")
public class ProductResource {
	
	private ProductService productService;
	
	public ProductResource(){
		productService = new ProductServiceImplementor();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
	@Path("/{id}")
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public Response getProduct(@PathParam("id") int productId){
		Product product = productService.findProductById(productId);
		if(product!=null)
			return Response.status(200).entity(product.toString()).build();
		else
			return Response.status(200).entity("Product " + productId + "not found").build();
	}
	
	@Path("/products/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Product getProductById(@PathParam("id") int productId){
		
		return productService.findProductById(productId);
	}
	
	@Path("/count")
	@GET
	@Produces("text/plain")
	/*public Response getProductCount(){
		return Response.status(200).entity(" No Of Products " + productService.getProductCount()).build();
	}*/
	
	public String getProductCount(){
		return " No Of Products " + productService.getProductCount();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response createProduct(@FormParam("id") int productId,@FormParam("name") String name, @FormParam("brand") String brand,@FormParam("price") float price){
		Product product = new Product(productId , name, brand, price);
		productService.create(product);
		return Response.ok().build();
		
	}

	@Path("/delete/{id}")
	@DELETE
	@Produces("text/plain")
	public String removeProduct(@PathParam("id") int productId){
		Product product = productService.findProductById(productId);
		if(product!=null){
			productService.remove(product);
			return "Product " + productId + " deleted ";
		}
		else{
			return "Product" + productId + " does not exist";
		}
				
	}
}
