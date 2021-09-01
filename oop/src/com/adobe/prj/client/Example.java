package com.adobe.prj.client;

import com.adobe.prj.entity.Account;

public class Example {

	public static void main(String[] args) {
		Account rahulAcc = new Account();
		Account swethaAcc = new Account();
		rahulAcc.deposit(5000);
		swethaAcc.deposit(8000);
		System.out.println(rahulAcc.getBalance());

	}

}
