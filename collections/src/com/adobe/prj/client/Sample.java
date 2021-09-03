package com.adobe.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.adobe.prj.entity.Product;

public class Sample {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(6,2,11,81,23,14,9,10);
		List<Integer> slist = filter(iList, no -> no % 2 == 0);
		System.out.println(slist);
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		
		List<Product> mobiles = filter(products, p -> p.getCategory().equals("mobile"));
		for(Product p : mobiles) {
			System.out.println(p);
		}
	}
	
	private  static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
		List<T> list = new ArrayList<>();
		for(T elem : elems) {
			if(predicate.test(elem)) {
				list.add(elem);
			}
		}
		return list;
	}
}
