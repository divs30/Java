package com.adobe.prj.client;

public class Demo {

	public static void main(String[] args) {
		int x = 10; // primitive
		
		Integer iX = x; // boxing, wrap
		
		int y = iX; // un-boxing, unwrap
		y++;
		System.out.println(y);
	}

}
