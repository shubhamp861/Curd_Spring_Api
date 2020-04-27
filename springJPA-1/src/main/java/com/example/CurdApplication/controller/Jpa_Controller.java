package com.example.CurdApplication.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CurdApplication.Model.Product;
import com.example.CurdApplication.Service.Jpa_Service;

@RestController
public class Jpa_Controller {
	
	
	@Autowired
	private Jpa_Service service;
	
	@GetMapping("/getProductlist")
	@CrossOrigin
	@Transactional
	public Iterable<Product> getProductlist()
	{
		return service.getProductList();
	}
	
	@PostMapping("/saveProduct")
	@CrossOrigin
	@Transactional
	public void saveProduct (Product product)
	{
		service.saveProduct(product);
	
	}
	
	@GetMapping("/getProductByName/{name}")
	@CrossOrigin
	@Transactional
	public Product getProductByName(@PathVariable  String name)
	{
		return service.getProductByName(name);
	}
	
	@GetMapping("/deleteProductByName/{name}")
	@Transactional
	@CrossOrigin
	public Iterable<Product> deleteProductByName(@RequestBody @PathVariable String name)
	{
		
		return service.deleteProductbyName(name);
	}

}
