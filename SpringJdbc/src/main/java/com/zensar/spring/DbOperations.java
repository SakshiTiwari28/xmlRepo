package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
    	
     ApplicationContext ctx =new ClassPathXmlApplicationContext("dbConfig.xml");
     Product product =new Product(4503, "Laptop" ,"Dell",50000);
     ProductService service = ctx.getBean("productServiceImpl",ProductService.class);
     //service.create(product);
     product =service.findProductById(4503);
     System.out.println(product);
     
     Product product1 = new Product(1002,"Laptop","HP",65770);
     service.edit(product1);
     
     Product product2 = new Product();
     product2.setProductId(4503);
     //service.remove(product2);
     
     /*List<Product> productList = service.findAllProducts();
     for(Product p: productList)
    	 System.out.println(p);
*/     
     
    }
}
