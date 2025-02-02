package com.zensar.service.business;

import java.util.ArrayList;
import java.util.List;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImplementor;
import com.zensar.entities.Product;

/*
 *  Author:Sakshi Tiwari
 *  Date: 25th Jul 2019 5.55AM
 *  Modified Date: 26th Jul 2019 9.50AM
 *  Version: 2.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description:Data Access Object Interface Class
 *  It encapsulates business logic of application.
 *  It interacts with dao layer to get data from database.
 *  It also interacts with presentation layer to give data as per business requirement.
 */
public class ProductServiceImplementor implements ProductService {
	
	private ProductDao dao;
	
	public ProductServiceImplementor(){
		dao=new ProductDaoImplementor();
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);

	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
        Product dbProduct =findProductById(product.getProductId());
        if(dbProduct!=null){
        	dbProduct.setName(product.getName());
        	dbProduct.setBrand(product.getBrand());
        	dbProduct.setPrice(product.getPrice());
        	dao.update(dbProduct);
         }
        else{
        	System.out.println("Product not Found");
        }
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
         Product dbProduct = findProductById(product.getProductId());
         if(dbProduct!=null){
        	dao.delete(dbProduct); 
         }
         else{
        	 System.out.println("Product Not Found");
         }
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return findAllProducts().size();
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> pList =findAllProducts();
		List<Product> pBList= new ArrayList<>();
		for(Product p:pList){
			if(p.getBrand().equals(brand)){
				pBList.add(p);
			}
		}
		return pBList;
	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> pList =findAllProducts();
		List<Product> pPList = new ArrayList<>();
		for(Product p:pList){
			if(p.getPrice()>=minPrice&&p.getPrice()<=maxPrice){
				pPList.add(p);
			}
		}
		return pPList;
		
	}

}
