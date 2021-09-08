package com.adobe.prj.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adobe.prj.entity.Product;
import com.adobe.prj.service.OrderService;

@RestController
@RequestMapping("api/products")
public class ProductController {
	@Autowired
	private OrderService service;
	
	// http://localhost:8080/api/products
	// http://localhost:8080/api/products?low=1000&high=50000
	// ? is queryparam ==> RequestParam
 
	@GetMapping()
	public @ResponseBody List<Product> getProducts(@RequestParam(name="low", defaultValue = "0.0" ) double low,
			@RequestParam(name="high", defaultValue = "0.0" ) double high) {
		if(low == 0.0 && high == 0.0) {
			return service.getProducts();
		} else {
			return service.productsByRange(low, high);
		}
	}
	
	// http://localhost:8080/api/products/5
	// pathparam
	@GetMapping("/{pid}")
	public @ResponseBody Product getProduct(@PathVariable("pid") int id) throws NotFoundException {
		return service.getProductById(id);
	}
	
	// POST 
	// http://localhost:8080/api/products
	// payload {"id":20,"name":"Samsung z4 Clip","price":120000.0,"quantity":400}
	// @RequestBody Product p ==> JSON from client payload is converted to Product 
	@PostMapping()
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody Product addProduct(@Valid @RequestBody Product p) {
		return service.addProduct(p);
	}
	
	// PUT http://localhost:8080/api/products/5
	// payload contains other fields
	@PutMapping("/{pid}")
	public @ResponseBody Product updateProduct(@PathVariable("pid") int id, @RequestBody Product p)  throws NotFoundException{
		service.updateProductPrice(p.getPrice(), id);
		return service.getProductById(id);
	}
}
