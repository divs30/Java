package com.adobe.prj.entity;

public class Account {
	private double balance; // state of object ==> instance variables 

	// instance methods ==> behaviour of object
	public void deposit(double amt) {
		this.balance += amt;
	}

	public double getBalance() {
		return this.balance;
	}
}