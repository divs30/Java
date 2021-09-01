# Java and Spring Boot 


Trainer: Banuprakash C

Full Stack Architect,

Co-founder Lucida Technologies Pvt Ltd.,

Corporate Trainer,

Email: banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/


https://github.com/BanuPrakash/Java

===================================



Softwares Required:
1) Java 8+
	https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

2) Eclipse for JEE  
	https://www.eclipse.org/downloads/packages/release/2020-03/m1/eclipse-ide-enterprise-java-developers

3) MySQL  [ Prefer on Docker]

Install Docker Desktop

Docker steps:

a) docker pull mysql

b) docker run --name local-mysql –p 3306:3306 -e MYSQL_ROOT_PASSWORD=Welcome123 -d mysql

container name given here is "local-mysql"

For Mac:
docker run -p 3306:3306 -d --name local-mysql -e MYSQL_ROOT_PASSWORD=Welcome123 mysql


c) CONNECT TO A MYSQL RUNNING CONTAINER:

$ docker exec -t -i <container_name> /bin/bash

d) Run MySQL client:

bash terminal> mysql -u "root" -p

mysql> exit

========================================================

OOP ==> Object Oriented Programming
	Writing programs which resemble real world
	Tv, AC, Laptop, Fan, Bulb, ...

	Every Object has state [ temp, volume, channel, fan speed] and behaviour [On(), off(),
	increase(), decrease(), ..]

	BankingAccount 
		state ==> accNo, balance
		debit(), credit(), interest(), checkBalance()

	---

	Objects take messages /actions / behaviour ==> exposed thro interface

	================

	SOLID design Principles

	S ==> Single Responsibility
		  [ UI Object ==> good at accepting data and display part]
		  [ Object ==> Database ==> CRUD ==> CREATE, READ, UPDATE and DELETE]
	
	O ==> Open Close Principle
		 Closed for Change and open for extension	
	
	L ==> Liskov Substitution Principle
		  Generalization and Specialization relationship [ inheritance ]	

	I ==> Interface segregation

	D ==> Dependency Injection
		Inversion Of Control

	========================================

	Java?
		==> platform ==> Java Runtime Environment + APIs [ most of them are integration APIs]
		==> bytecode runs on Java Platform

		Bytecode ==> compiled code

		Development Kit is required to generate bytecode

		1) JDK ==> Java Development Kit ==> Java as programming language
			Source Code [ file.java] ==> javac ==> file.class [ bytecode]
		2) Scala ==> sdk
				  file.scala ==> scalac ==> file.class
		3) Groovy
				groovyc

		=====

		Bytecode uses APIs present in Java Platform for execution
		Bytecode is not self-contained

		c, c++ ==> exe ==> self contained
===========================================

Java Programming language:
	primitive data types
	1) byte ==> 1 byte of memory
		byte b = 100;
	2) short ==> 2 bytes
		short s = 100;
	3) int ==> 4 bytes
		int x = 100;

	4) long ==> 8 bytes
		long l = 100L;

	5) float ==> 4 bytes
		float f = 1.4f;

	6) double ==> 8 bytes
		double d = 1.4;


	7) boolean ==> 1 byte
		boolean flag = true;
	8) char ==> 2 bytes ==> unicode character set [ 2306 ==> Devangiri script]
				0-255 ASCII charaset

		char ch = 'A';

=============================================================================
 
$ java --version
openjdk 11 2018-09-25

open eclipse
 Help ==> About

===========================================

Account.java

public class Account {
	private double balance; // state of object 

	public void deposit(double amt) {
		this.balance += amt;
	}

	public double getBalance() {
		return this.balance;
	}
}


javac Account.java ==> Account.class

Example.java

public class Example {
	public static void main(String[] args) {
		Account rahulAcc = new Account();
		Account swethaAcc = new Account();
		rahulAcc.deposit(5000);
		swethaAcc.deposit(8000);
		System.out.println(rahulAcc.getBalance());
	}
}

javac Example.java ==> Example.class	

java Example


============================

Logically grouping of objects in enterprise application development
1) entity / domain / model
	Business data ==> data which is long lived ==> beyond life of application
	Customer, Vehicle, Driver, Trip, ... ==> stored in persistence storage ==> RDBMS/NoSQL
	Employee
	Entity classes <===> Storage [ RDBMS table ]
	fields ==> columns in table

2) DAO => 	Data Access Object
	CRUD operations are written in DAO
	insert into, select , update, delete

3) Business objects

4) Service ==> facade over business and DAO

5) UI ==> user interface classes 

===============

in java we use "package" to Logically grouping of objects/classes

Package are folder
com.adobe.aem.entity

com ==> adobe ==> aem ==> entity

Customer.java
User.java

com.adobe.aem.dao
	CustomerDao.java

com.adobe.aem.ui
	Client.java

==================================
 
new, state ==> instance variables ==> heap area for every object

instance methods ==> invoked using object context obj.method()

bulb.on()
tv.on();
tv.changeChannel(404);

========================

Memory Allocation is done using "new" keyword

code running on Virtual Machine / engine uses GC ==> Garbage Collector to release memory

C ==> malloc() and free(ptr)
C++ ==> new ...  and release by delete ptr;

In Java we don't release memory

swethaAcc = null; // i don't need that memory making it eligible for GC

=============================

* constructor
==> special methods called when object is created
new Account();

==> same name as that of class

==> No explicit return type; not even void

==> Compiler creates default constructor if we don't define any.

=============================

Requirement: need to track how many accounts are created


public class Account {
	private double balance; // state of object ==> instance variables 
	private static int count = 0;
	
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

==============

static methods can't have "this" because context is class and not object

System.out.println(Account.getCount()); // 4

System.out.println(rahulAcc.getCount()); // valid ==> changes to Account.getCount()

====================

Relationship between Objects:
1) Generalization and Specialization ==> IS A Relationship
2) Realization
3) Association ==> HAS A Relationship
4) Uses A relationship

int getId()
String getName()
double getPrice()

void setPrice(double price){ 
}

===================

Java Development tools
1) Maven
2) checkstyle
3) PMD / Spotbugs/ FindBugs
4) SONAR
5) Jenkins CI/CD
6) GIT

1) Checkstyle is a static code analysis tool 
Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard.
	==> NamingConventions
	==> Comments
	==> proper empty spaces 

2) PMD / Spotbugs/ FindBugs
PMD is an open source static source code analyzer that reports on issues found within application code.

if(condition){

} else {
	code
}

try {

} catch(Exception ex){}

Unreachable code

copy and Paste Detection

============

Mobile in my Pocket which has TataSky app

==============================================

 Generalization and Specialization ==> IS A Relationship

 Programming world we call this as Inheritance
 In Java we use "extends" keyword for Inheritance

// implicitly extends Object
 class Product {

 }

 class Mobile extends Product {

 }

 class Tv extends Product {

 }

===========================================================

constructors and Inheritance:

class Object{
	Object(){}
}

class Product {
	Product() {
		"P1"
	}

	Product(int id, String name) {
		"P2"
	}
 }

 class Mobile extends Product {
 	Mobile() {
 		"M1"
 	}

 	Mobile(int id, String name, String connectivity) {
 		"M2"
 	}
 }
=========

compiled code:


class Object{
	Object(){}
}

class Product {
	Product() {
		super();
		"P1"
	}

	Product(int id, String name) {
		super();
		"P2"
	}
 }

 class Mobile extends Product {
 	Mobile() {
 		super();
 		"M1"
 	}

 	Mobile(int id, String name, String connectivity) {
 		super();
 		"M2"
 	}
 }

============



class Object{
	Object(){}
}

class Product {
	Product() {
		"P1"
	}

	Product(int id, String name) {
		"P2"
	}
 }

 class Mobile extends Product {
 	Mobile() {
 		"M1"
 	}

 	Mobile(int id, String name, String connectivity) {
 		super(id,name);
 		"M2"
 	}
 }

 ==========

constructor Chaining within class

class Mobile extends Product {
 	Mobile() {
 		this(0,"","");
 		"M1"
 	}

 	Mobile(int id, String name, String connectivity) {
  		"M2"
 	}
 }

=========================

Methods and Inheritance

 
class Product {
	public double getPrice() {
		return 100;
	}
 }

 class Mobile extends Product {
 	public double getPrice() {
		return 999;
	}

	public String getConnectivity() {
		return "4G";
	}
 }
=============

// immutable

public class Tv extends Product {
	private String screenType;

	public Tv() {
	}

	public Tv(int id, String name, double price, String screenType) {
		super(id, name, price);
		this.screenType = screenType;
	}

	public String getScreenType() {
		return screenType;
	}
}

===========

Array of primitive

int[] data = new int[3];

		Product[] products = new Product[500]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");
		products[5] = new Microwave(..);
		products[6] = new WashingMachine(...);
		products[7] = new DishWasher(...);
		....

 
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

1) Upcasting 
 Product[] products = new Product[500]; 

 Mobile[] mobiles = ...
 Tv[] tvs = ...


 for(Mobile p : mobiles) {
			if(p.isExpensive()) { // Polymorphic ; dynamic binding ==> Runtime binding
				System.out.println(p.getName() + " is expensive!!!");
			} else {
				System.out.println(p.getName() + " is not expensive!!!");
			}
		}


 for(Tv p : tvs) {
			if(p.isExpensive()) { // Polymorphic ; dynamic binding ==> Runtime binding
				System.out.println(p.getName() + " is expensive!!!");
			} else {
				System.out.println(p.getName() + " is not expensive!!!");
			}
		}

========================

1) Read about NamingConventions in Java
2) Different types of Comments in Java

3) 
Time.java
public class Time {
	private int hrs;
	private int min;
	...
}


TimeExample.java

public class TimeExample {
	public static void main(String[] args) {
		Time t1 = new Time(4,30); // 4 hours and 30 min
		Time t2 = new Time(3,45); 

		Time t3 = Time.addTime(t1, t2);

		System.out.println(t1.getHrs() + " : " + t1.getMin()); // 4: 30
		System.out.println(t2.getHrs() + " : " + t2.getMin()); // 3: 45
		System.out.println(t3.getHrs() + " : " + t3.getMin()); // 8: 15
	}
}

===============================

