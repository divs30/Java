package com.adobe.prj.client;

import java.util.HashMap;
import java.util.Map;

public class HashStory {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String("hello");
		System.out.println(s3.hashCode());
		
		String s4 = new String("Aa");
		String s5 = new String("BB");
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		System.out.println("***********");
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Oracle", 3000.11);
		map.put("JS", 567.22);
		map.put("Java", 7322.22);
		
		map.put("JS", 999.99); // replace
		
		if(map.containsKey("Java")) {
			System.out.println(map.get("Java"));
		}
		System.out.println(map.get("JS"));
		
		map.forEach( (k, v) -> {
			System.out.println(k + " : " + v);
		});
		
	}

}
