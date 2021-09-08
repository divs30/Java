package com.adobe;

import com.adobe.prj.entity.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args)  throws Exception {
		Product p = new Product(20,"Samsung z4 Clip", 120000.00, 400);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(System.out, p);
		
		String s = "{\"id\":20,\"name\":\"Samsung z4 Clip\",\"price\":120000.0,\"quantity\":400}";
		
		Product r = mapper.readValue(s.getBytes(), Product.class);
		System.out.println(r.getName());
		
	}

}
