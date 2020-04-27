package com.example.CurdApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CurdApplication.Model.Product;
import com.example.CurdApplication.Repository.Jpa_Repository;

@Service
public class Jpa_Service {
	
	@Autowired
	private Jpa_Repository repo;
	
	public Iterable<Product> getProductList()
	{
		return repo.findAll();
	}
	
	public void saveProduct(Product product)
	{
		repo.save(product);
	}
	
	public Product getProductByName(String name)
	{
	
		return repo.findByName(name);
	}
	
	public Iterable<Product> deleteProductbyName(String name)
	{

		repo.deleteByName(name);
		return repo.findAll();
	}

}
