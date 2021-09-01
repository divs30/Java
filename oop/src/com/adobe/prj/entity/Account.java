package com.adobe.prj.entity;

public class Account {
	private double balance; // state of object ==> instance variables 
	private static int count = 0; // state of class ==> class variable
	
	//default constructor
	public Account() {
		this.balance = 0.0;
		count++;
	}
	
	// parameterized constructor
	public Account(double amt) {
		this.balance = amt;
		count++;
	}
	
	// instance methods ==> behaviour of object
	public void deposit(double amt) {
		this.balance += amt;
	}

	public double getBalance() {
		return this.balance;
	}
	
	// class member
	public static int getCount() {
		return count;
	}
}