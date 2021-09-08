package com.adobe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adobe.prj.entity.Product;
import com.adobe.prj.service.OrderService;

@SpringBootApplication
public class OrderappApplication implements CommandLineRunner {
	@Autowired(required = false)
	private OrderService service;
	
	public static void main(String[] args) {
		/* ApplicationContext ctx = */ SpringApplication.run(OrderappApplication.class, args);
//		OrderService service = ctx.getBean("orderService", OrderService.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// this method gets called as soon as Spring container is created
		// can access all spring beans here
		// helps @Autowired in client code instead of using ApplicationContext ctx;
		// ctx.getBean(....)
		//		addProduct();
		//	printProducts();
		//		update();
		
	}

	private void update() {
		service.updateProductPrice(650.00, 2);
	}

	private void addProduct() {
		service.addProduct(new Product(0,"Samsung z4 Clip", 120000.00, 400));
	}

	private void printProducts() {
//		List<Product> products = service.getProducts();
		List<Product> products = service.productsByRange(100, 10_000);
		for(Product p : products) {
			System.out.println(p);
		}
	}

	
}
