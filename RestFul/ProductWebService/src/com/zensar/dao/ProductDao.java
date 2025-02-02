package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Product;
/*
 *  Author:Sakshi Tiwari
 *  Date: 26th Jul 2019 10.00AM
 *  Modified Date: 26th Jul 2019 10.00AM
 *  Version: 1.0
 *  CopyRight: Zensar. All rights reserved.
 *  Description: Data Access Object Interface.
 *  It is used to access Product Data from  Database.
 */

public interface ProductDao {

	
void insert (Product product);
void update (Product product);
void delete (Product product);

Product getById(int productId);

List<Product> getAll();
}
