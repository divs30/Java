package com.adobe.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.adobe.prj.entity.Product;

public class ListExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer")); // supports duplicate elements
	
//		Collections.sort(products);
//		Collections.sort(products, (p1, p2) -> (int)(p1.getPrice() - p2.getPrice()));
		Collections.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		
		for(Product p : products) {
			System.out.println(p); // toString()
		}
		
		System.out.println("********");
		
		products.stream()
			.filter(p -> p.getCategory().equals("mobile"))
			.forEach(p -> System.out.println(p));
		
		System.out.println("******");
		
		List<Integer> iList = Arrays.asList(6,2,11,81,23,14,9,10);
		iList.stream()
			.filter(no -> (no % 2 == 0))
			.forEach(System.out::println); // Method reference same as (no -> System.out.println(no))
		
		System.out.println("-------------------");
		
		List<Product> mobiles = products.stream()
				.filter(p -> p.getCategory().equals("mobile"))
				.collect(Collectors.toList());
		
		System.out.println("=========== MAP ===========");
		List<String> names = products.stream()
			.map(p -> p.getName())
			.collect(Collectors.toList());
		
		names.forEach(System.out::println); // not using stream
		
		System.out.println("************");
		
		// total cost of computers
		
		double total = products.stream()
					.filter(p -> p.getCategory().equals("computer"))
					.map(p -> p.getPrice())
					.reduce(0.0, (v1, v2) -> v1 + v2);
		
		System.out.println(total);
		
		System.out.println("***********");
		
		Map<String, List<Product>> productCat = 
				products.stream().collect(Collectors.groupingBy(p -> p.getCategory()));
		
		productCat.forEach( (k,v) -> {
			System.out.println("Category :" + k);
			v.forEach(System.out::println);
		});
		
		
	}

}
