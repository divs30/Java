package com.adobe.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adobe.prj.dao.ProductDao;
import com.adobe.prj.entity.Product;

@Service
public class OrderService {
	@Autowired
	private ProductDao productDao;
	
	public List<Product> getProducts() {
		return productDao.findAll();
	}
	
	public Product addProduct(Product p) {
		return productDao.save(p);
	}
	
	public Product getProductById(int id) {
		return productDao.findById(id).get();
	}
	
	public List<Product> productsByRange(double low, double high) {
		return productDao.getProductsByRange(low, high);
	}
	
	@Transactional
	public void updateProductPrice(double price, int id) {
		productDao.updateProductPrice(price, id);
	}
}
