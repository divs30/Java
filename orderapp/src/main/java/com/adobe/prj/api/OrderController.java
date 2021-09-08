package com.adobe.prj.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.adobe.prj.entity.Order;
import com.adobe.prj.service.OrderService;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@GetMapping()
	public @ResponseBody List<Order> getOrders() {
		return service.getOrders();
	}
	
	@PostMapping()
	public @ResponseBody Order insertOrder(@RequestBody Order order) {
		return service.placeOrder(order);
	}
}
