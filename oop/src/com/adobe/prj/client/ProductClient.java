package com.adobe.prj.client;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
//		products[5] = new Product(); // can't instantiate Product ==> abstract
		
		for(Product p : products) {
			System.out.println(p);
		}
//		printExpensive(products);
//		printDetails(products);
		
		List<HashMap<String, String>> data = printOCPway(products);
		
		for(HashMap<String, String> map : data) {
			map.forEach( (k, v) -> {
				System.out.println(k + " : " + v);	
			});
			System.out.println("********");
		}
	}	
	// OCP
	private static List<HashMap<String, String>>  printOCPway(Product[] products) {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		for(Product p : products) {
			HashMap<String, String> map = new HashMap<String, String>();
			Method[] methods = p.getClass().getMethods();
			for(Method m : methods) {
				if(m.getName().startsWith("get")) {
					Object retValue = null;
					try {
						retValue = m.invoke(p);
					} catch(Exception ex) { ex.printStackTrace();}
					map.put(m.getName().substring(3).toUpperCase() , retValue.toString());
				}
			}
			list.add(map);
		}
		return list;
	}

	// Not OCP
	private static void printDetails(Product[] products) {
		for(Product p : products) {
			System.out.println(p.getId() +", " + p.getName() +", " + p.getPrice());
			if(p instanceof Tv) { // checks if it is Assignable
				Tv t = (Tv) p; // downcasting
				System.out.println(t.getScreenType());
//			} else if (p instanceof Mobile) {
			} else if (p.getClass() == Mobile.class) {
				Mobile m = (Mobile) p;
				System.out.println(m.getConnectivity());
			}
			System.out.println("*********");
		}
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
