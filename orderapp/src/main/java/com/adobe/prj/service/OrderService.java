package com.adobe.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adobe.prj.dao.CustomerDao;
import com.adobe.prj.dao.OrderDao;
import com.adobe.prj.dao.ProductDao;
import com.adobe.prj.entity.Customer;
import com.adobe.prj.entity.Item;
import com.adobe.prj.entity.Order;
import com.adobe.prj.entity.Product;

@Service
public class OrderService {
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private OrderDao orderDao;
	
	// order has customer and items;
	// items has product
	// @Transactional makes all the operations witin this method atomic
	//	if no exceptions it commits all operations
	// if exception; rollback all
	
	@Transactional
	public Order placeOrder(Order order) {
		List<Item> items = order.getItems();
		double total = 0.0;
		for(Item item : items) {
			Product p = productDao.getById(item.getProduct().getId());
			p.setQuantity(p.getQuantity() - item.getQty());
			item.setPrice(item.getQty() * p.getPrice());
			total += item.getPrice();
		}
		order.setTotal(total);
		return orderDao.save(order);
	}
	
	public List<Order> getOrders() {
		return orderDao.findAll();
	}
	
	public Customer addCustomer(Customer c) {
		return customerDao.save(c);
	}
	
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}
	
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
