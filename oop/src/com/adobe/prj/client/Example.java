package com.adobe.prj.client;

import com.adobe.prj.entity.Account;

public class Example {

	public static void main(String[] args) {
		
		Account rahulAcc = new Account(70000);
		
		Account swethaAcc = new Account();
		
		rahulAcc.deposit(5000);
		swethaAcc.deposit(8000);
		System.out.println(rahulAcc.getBalance());
		
		Account a1 = new Account();
		Account a2 = new Account();
		
		System.out.println(Account.getCount()); // 4
		
	}

}
