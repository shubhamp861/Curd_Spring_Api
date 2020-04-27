package com.example.CurdApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CurdApplication.Model.Product;

@Repository
public interface Jpa_Repository extends JpaRepository<Product, Integer> {

	public Product findByName(String name);
	public void deleteByName(String name);
}
