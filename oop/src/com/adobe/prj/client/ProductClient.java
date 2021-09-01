package com.adobe.prj.client;

import com.adobe.prj.entity.Mobile;
import com.adobe.prj.entity.Product;
import com.adobe.prj.entity.Tv;

public class ProductClient {
	// cmd + shift + o for organize imports
	// ctrl + shift + o
	public static void main(String[] args) {
		Product[] products = new Product[5]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");
		
		printExpensive(products);
	}
	
	// OCP ==> Closed for Change; open for extension
	private static void printExpensive(Product[] products) {
		for(Product p : products) {
			if(p.isExpensive()) { // Polymorphic ; dynamic binding ==> Runtime binding
				System.out.println(p.getName() + " is expensive!!!");
			} else {
				System.out.println(p.getName() + " is not expensive!!!");
			}
		}
	}

}
