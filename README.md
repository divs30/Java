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

BankingApplication ACME Bank ==> APIs from Citrus / Verisign

===========================================

Tv t = new Product(); // not valid

if(p instanceof Tv)

instanceof ==> checks if it is Assignable

========
If we know method name:
ctx.method();

p.getId(); ==> internally getId(p); where "p" will be passed as "this"

===
Reflection API:

m.invoke(p); ==> if we have method pointer
as good as  getId.invoke(p); ==> explicitly pass "p" to be refered as "this"

=============

 getter() returning an Product

 Object retValue = m.invoke(someObject);

 if retValue is an Product

 System.out.println(retValue); ==> it internally invokes toString() method ==> Object

 ===========

 ORM, JPA, Spring, Jersey ==> expect entity classes to follow Java Bean naming convention getters/setters

======================================

I need to buy a Product? ==> Which 

I need to open an Account? ==> What type of Account

Product, Account ==> are too generic ==> doesn't exist in real world ==> used as generalization
such classes are marked as "abstract" ==> prevent an Object from getting created


==>

abstract methods ==> forces all inherited concrete classes to implement the method

* concrete classes ==> objects of the class can be created
* if a class has abstract methods ==> class should be marked as abstract
* abstract class need not have abstract methods

==============================================================

Realization Relationship

Object/Component will realize the behaviour specified by other in order to communicate

interface is used for Realization relationship:

interface ProductDao {
	void addProduct(Product p);
	Product getProduct(int id);
}

Why Program to interface?
* DESIGN
* IMPLEMENTATION
* TESTING
* INTEGRATION
* LOOSE COUPLING


Development ==> common modules are created first [ entity classes and interfaces] ==> "jar" file

"jar" files are shared between development groups

===================================
extends => Specialization

implements ==> Realization

public class MobileDaoDBImpl implements MobileDao {

==================

interface can't have state and behaviour
abstract class can have state and behaviour common to all inherited members

====
Issue with this code:
MobileDao mobileDao = new MobileDaoMongoImpl(); // loose coupling ==> Strategy Pattern

1) switching between strategies is done in client code
2) Heterogenous clients [ web, mobile, standalone, ...]
3) No abstraction in client code

Solution:
* use Factory Pattern
* factories manufacture objects

=======

class PlantFactory {

	public static Plants[] getPlants(String season) {
		switch(season) {
			case "SUMMER": ..
			case "RAINY" : ..
			case "WINTER": ..
		}
	}
}


Plants[] plants = PlantFactory.getPlants("SUMMER");

=============


Switching between strategies is happing in Factory instead of Client:
* every time to switch between strategies Factory class gets changed instead of many clients

public class MobileDaoFactory {
	// factory method
	public static MobileDao getMobileDao() {
		return new MobileDaoMongoImpl();
	}
}

* ===> Need to switch between strategies without changing any line of Java code

* ==> by using configuration files [ xml / json / properties]

XML ==> JAXB library
JSON ==> Jackson , Jettison , Moxy

==============

config.properties

MOBILE_DAO=com.adobe.prj.dao.impl.MobileDaoDbImpl


* Classloader loads classes if it's used anywhere for creating objects or references


// FrontEnd code
public class MobileClient {
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
//		MobileDao mobileDao = new MobileDaoMongoImpl(); // loose coupling ==> Strategy Pattern
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		mobileDao.addMobile(m);
	}

}

java MobileClient:
* loads MobileClient.class
* loads String.class
* loads Mobile.class ==> Product.class
* MobileDao.class
* MobileDaoFactory.class
* MobileDaoMongoImpl.class

Account.class, AccountClient.class, MobileDaoDBImpl.class, Tv.class are not loaded into JVM


Class.forName("name"); // loads class

Class.forName("java.util.Date"); // loads Date.class into JVM

Class.forName("com.adobe.prj.dao.impl.MobileDaoDbImpl"); // loads MobileDaoDbImpl

===========

Creating Objects:

* if we know class name in advance
new ClassName();
new Date()

* if classname is dynamic:

String str = "com.adobe.prj.dao.impl.MobileDaoMongoImpl"; // read from config.properties

Class.forName(str).newInstance();

========
 
interface Comparable {
	int compareTo(Object o);
} 

o1.compareTo(o2);


class Rectangle implements Comparable {
	///
	public int compareTo(Object o) {
		// area diff
	}
}

class Product implements Comparable {
	//
	public int compareTo(Object o) {
		// price diff
	}
}

class String implemements Comparable {
	public int compareTo(Object o) {
		// ASCII diff
	}
}


==========


public static void sort(Comparable[] elems) {
	for i = 0; i < elems.length;
		for j = i + 1; ...
			if(elems[i].compareTo(elems[j]) > 0)
				swap
}

=======

Utility.java
Product.java
ProductClient.java

========================


interface Swim {
	void swim();
}

interface Fight {
	void fight();
}

interface Dance {
	void dance()	;
}

// actor is capable to dance
class Actor implements Dance {
	..
	public void dance() {
		...
	}
}
// hero is a actor; hero also knows to dance
// hero can also fight and swim
class Hero extends Actor implements Fight, Swim{
	public void fight() {//}
	public void swim() {//}
}

=====================================================

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	//state and behaviour
	public void fly() {

	}
}

class AeroPlane implements Flyable {
	//state and behaviour
	public void fly() {

	}
}

Flyable f = new Flyable(); // is this valid? ==> can't instantiate interface like abstract class

// Anonymous class
Flyable f = new Flyable() {
	public void fly() {
		"jump from 10th floor!!!"
	}
}

=====================================


Java 8 ==> introduced lambda expression for functional interface [ interface with only one method 
to implement]


======================================

Generics in Java <>

class Rectangle <T> {
	private T width;
	private T breadth;
	...
}

Rectangle<Integer> r1 = new Rectangle<Integer>(4,5);


Rectangle<Double> r2 = new Rectangle<Double>(1.4,4.5);


Rectangle<String> r3 = new Rectangle<String>("4cm","5inch");


=======

Integer is a type-wrapper class for int

Double is a type-wrapper class from double


class LinkedList<T> {
	Node<T> node;
}

LinkedList<Product> list = ..

LinkedList<String> list = ..

================================



class Rectangle <T extends Number> {
	private T width;
	private T breadth;
	...
}

=================================


Exception handling in Java.

Exception ==> An abnormal condition that arises during program execution
When an exception occurs an object is created which contains:
1) What Went Wrong?
2) Why?
3) Where?

===========

Exceptions can be checcked type or unchecked type of exceptions

java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Checked1 {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
			try {
				compute();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
		System.out.println("Main ends!!!");
	}

	private static void compute() throws FileNotFoundException, SQLException {
			FileInputStream fs = new FileInputStream("a.txt");
			Connection con = DriverManager.getConnection("");
	}

}

======


public class Checked1 {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
			try {
				compute();
			} catch ( Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("Main ends!!!");
	}

	private static void compute() throws  Exception {
			FileInputStream fs = new FileInputStream("a.txt");
			Connection con = DriverManager.getConnection("");
	}

}

==================

interface UserDao {
	void register(User user);
}

class UserDaoMySQLImpl implements UserDao {
	//
	public void register(User user) {
		try {

			} catch(SQLException ex) {
				// log exception
			}
	}
}

client:

User u = new User(...);
UserDao userDao = new UserDaoMySQLImpl();
userDao.register(u);

====


interface UserDao {
	void register(User user) throws SQLException;
}



class UserDaoMySQLImpl implements UserDao {
	//
	public void register(User user) throws SQLException {
		 
	}
}


class UserDaoMySQLImpl implements UserDao {
	//
	public void register(User user) throws MongoDBException {
		 
	}
}



Client:
try {
		User u = new User(...);
		UserDao userDao = new UserDaoMySQLImpl();
		userDao.register(u);
	} catch(SQLException ex) {
				// log exception
	}

======

UserDefined Exception classes

class PeristenceException extends Exception {
	..
}

interface UserDao {
	void register(User user) throws PeristenceException;
}

Client:
try {
		User u = new User(...);
		UserDao userDao = new UserDaoMySQLImpl();
		userDao.register(u);
	} catch(PeristenceException ex) {
				// log exception
	}



class UserDaoMySQLImpl implements UserDao {
	//
	public void register(User user) throws PersistenceException {
		 try {
		 		// code
		 	} catch(SQLException ex) {
				throw new PersistenceException(propermessage)
		}
	}
}


class UserDaoMySQLImpl implements UserDao {
	//
	public void register(User user) throws PersistenceException {
		 try {
		 		// code
		 	} catch(MongoDBException ex) {
				throw new PersistenceException(propermessage)
		}
	}
}

================

Data Containers and Java 8 Stream ==> HOF
Threads

=========================

Day 3

OCP ==> Reflection API ==> Methods, Class.forName() newInstance() instead of "new"
Realization Relationship ==> interface ==> Anonymous class ==> Lambda expression for FuntionalInterface [ interface with only one method to implement]

Strategy Pattern , Factory Pattern, Generic Class <T>

=================

Exception Handling
Exception: What, Why, Where
DefaultExceptionHandler for every Thread ==> If an exception is not caught in a method it pushs up the call stack ==> If no method in the stack hanldes it; exception object is given to DefaultHandler
==> If exception is handed over to Default Handler ==> Thread dies

UnChecked type of exceptions should be handled using conditional statements and not with try-catch

if(product != null) {
	productDao.addProduct(product);
}

if( y != 0) {
	result = x / y;
}

They occur because of reasons  within JRE;

---------

Checked type of exceptions
 are actualy triggered outside of JRE as in ==> Database, File, OS, ...
 SQLException, IOException 
 try {

 } catch(SQLException ex) {

 }

==> throws SQLException

 =========================


Java Collection Framework ==> Data Containers

Array is a data container
Product[] products = new Product[100];

int[] elems = new int[50];
int elems[] = new int[5];

* size is fixed; can't grow or shrink
* adding or removing from arbitrary position is difficult

Java Collection Framework provides many data containers
* interfaces
* implementation classes
* Algorithm classes [ sort, max, binarySearch, ..]

==> You can also use 3rd party implementation classes for the interfaces provided by JCF
* Apache Commons Collection
* VAVR [ https://www.vavr.io/ ]

======

Comparable

1) natural comparision
String by ascii/unicode
Product by id
employee by id

2) Logic is part of object
String and Product has compareTo() method

public interface Comparable<T> {
	    public int compareTo(T o);
}

String s1 = ..
String s2 = ..

s1.compareTo(s2);

Comparator

1) Other than natural comparision based
on client requirement
String by length
[Lee, Brad, Harry, Angelina]
Product by name/price

2) Logic will be in client who is sorting/max/..

public interface Comparator<T> {
	  int compare(T o1, T o2);
}

String s1 = ..
String s2 = ..

comp.compare(s1 , s2);

=========================

 public class Example {

 public static void main(String[] args) {
	Runnable r = new Runnable() {
	  public void run() {
	 	System.out.println("Hello");	
         	}
	};
} 

private static void doTask(Runnable r) {
  r.run();
}
}

Vs

---

public class Example {

 public static void main(String[] args) {
	Runnable r = () -> System.out.println("Hello");	
 }
} 

private static void doTask(Runnable r) {
  r.run();
}
}

============================

* List is an interface of JCF
=> ordered collection
=> supports duplicate elements
=> index based operations are supported
	add(5, "a");
	remove(2);
	get(10);
=> can be re-orderd ==> sort()/ shuffle() / reverse()

===

ArrayList / LinkedList are implmentations of List interface	

=======
1)
Program to interface:

List list = new ArrayList();
or
List list = new LinkedList();
or 
List list = new Apache provided implmentation OR VAVR 

list.add("A");
list.add(4);
list.add(new Date()); 

Above code is not type-safe

String s1 = list.get(0); // no problem

s1 = list.get(1); // ClassCastException

We may need "instanceof" or getClass() to do type-checking

2)

List<String> list = new ArrayList<String>(); // type-safe collection with generics

list.add("A"); // valid
list.add(4);	 // fails

for(String s : list) {
	no need to typecheck
}

===========================

Functional Style of Programming with HOF

* OOP
methods are tightly coupled to state of object [ deposit() can be used only on Account]

* FunctionalStyle of Programing
functions ==> not tightly coupled to state of object [ can be used on any type]


High Order Function
* functions which can accept other functions as arguments
* functions return a function
* pass and return functions similar to primitive or object

==> Lambda expression and FunctionalInterface

Some of the built-in FunctionalInterfaces
* Predicate
* Supplier
* Consumer
* Runnable
* Comparator
* Function
* BiFunction

Commonly used HOF:
https://rxmarbles.com/

* filter ==> get subset based on predicate
	==> get even numbers 
	==> get only mobile products
* map
	==> to transform the data based on Transform function [Function]

* forEach
* reduce
* flatMap
* limit
* skip
* collect

==========
Java 8 streams supports using HOF

data flowing from network/ filesystem/ or Reactive Databases like MongoDB / Postgres RJDBC/ JCF

=========

Generic Collections are not covariant

List<Integer> ilist = ...

List<Double> dList = ...

List<Product> plist = ...


List<Object> list = plist; // error


==========

Object o = new Product();

Object o = new Integer(); // 

=========
List<String> nameData 
I need names of only computer products

============

intermediary operaitons ==> map, flatMap, filter, skip, limit

terminal operations ==> forEach, collect, reduce


=====================================

Weekend: Self-study
1) flatMap
2) Set, HashSet and TreeSet

===============================

Map ==> Storage in the form of Key/ Value pair
Key ==> Unique
value ==> can be duplicate

Example: Dictionary, Registry, ..

CONNECTIVITY : 4G
NAME : MotoG
ID : 453
PRICE : 12999.0

=============================

HashMap implements Map

class Rectangle {
	w, b

	public int hashCode() {
		return w * b;
	}
}

4 x 5 ==> 20
5 x 4 ==> 20
10 x 2 ==> 20
20 x 1 ==> 20
...

====================================

Java Concurrent Programming ==> Writing multi-threaded applications

Process ==> Program in execution ==> should have atleast one unit work

Thread ==> unit of work

notepad, calculator, file explorer ==> single threaded application

Word, Eclipse, Web Browser ==> multi threaded application

* In Word 
	==> document editing is one thread
	==> Spell check is one thread
	==> Grammer check
	==> Auto Saving

* In Eclipse
	=> Program editing
	=> Syntax check
	=> auto complete
	=> Incremental compile

=============

Why do we need Multi-threaded application?
1) Better User experience
2) Avoid starvation
3) Optimization of resource usage
	1 Thread ==> 1 posix thread ==> 1 core / CPU
	1 document can be used by "spell check", "grammer check", "editing"
4) If one functionality fails as in GrammerCheck ==> only GrammerCheck thread destroyed, applicaiton
can still run with "Editing", "Spell check", "auto-save"

====================================
Java Provides:

1)

interface Runnable {
	void run();
}

Main thread ==> entry point is main() method
for every other thread entry point is run() method

class SpellCheckThread implements Runnable {

	public void run() {
		doCheckSpell();
	}

	void doCheckSpell(){

	}
}

===========
2) Thread class

has thread control methods
* start()
* sleep(long ms)
* yield()
* join()
* interrupt()

Depecreated methods:
* suspend()
* resume()
* stop()

===============

Thread Safety

* member is thread safe if it doesn't get corrupted in multi-threaded environment

* Local variables ==> Stack ==> each thread has a seperate stack ==> SAFE

* Instance variables ==> HEAP ==> threads share heap area ==> Not Safe
	Word Document is on Heap ==> spell, grammer and edit are happening

* Static variables ==> class data ==> loaded classes are shared ==> Not Safe

================================================

Maven, Database and web application development

=========================

How HashSet works?

flatMap()

RDBMS ==> SQL skills

CRUD operations on RDBMS

https://www.sqltutorial.org/


==============

join() ==> caller thread [ main ] waits for other thread [ t1, t2, t3] to finish execution

======================

wait() and notify() along with semaphore

=====================================
Java Concurrency in Practice

==================================

Day 4

-----

Maven ==> Java Build tool
* Manages dependencies [ Project may need many 3rd party dependencies ==> libraries ==> "jar" files]
==> Issues: each member might download different versions; manage transitive dependencies

Maven manges dependecies ==> download, publish from/to repositories [ similar to PIP of Python, Webpack/grunt of NodeJS]

* pom.xml ==> Project Object Model ==> dependencies are configured. pom.xml is shared to all team members; 

----
* Maven to compile/ test / build / publish /run of server ...

===============================
	below 3 combination should be unique:
 	GroupId: organization+module ==> com.uber.eat
 	artificatId: moduleName ==> customerModule
 	version: 1.0.0
==================================
Maven Goals: clean, compile, build, publish, install, ..

Maven --> Plugins ==> Configure JRE version / Server / Profile

Compile:
mvn compile

=============


JDBC ==> Java Database Connectivity ==> Integration APIS [ connecting to different technologies]

JDBC ==> to connect to RDBMS

JDBC contains interfaces only.
Implementation classes are provided by database vendors [ Oracle / MySQL/ Postgres, ... provides "jar" implmentating these interfaces]

int x  = 10; ==> JAVA CODe

Database ==> Oracle == NUMBER(12)
MySQL == INT

NUMERIC(12)

String s = "Hello";

Oracle VARCHAR2(100)
MySQL VARCHAR(100)
SQL Server ==> TEXT

data dd-mmm-yyy in oracle and "yyyy-mm-dd" in MySQL

==================================

JDBC Steps:

1) Load driver classes provided by database vendor [ MySQL / Oracle/ Postgrees]

Class.forName("com.mysql.cj.jdbc.Driver"); 

Class.forName("oracle.jdbc.Driver"); 

2) Establish a database Connection:
	// use factory method
	java.sql.Connection is an interface

	java.sql.Connection con = DriverManager.getConnection(url, username, password);


	getConnection() returns MySQLConnection / ORacleConnection / .. based on URL


	URL ==> "jdbc:mysql://192.168.45.11:3306/adobe_db"

	getConnection() creates MySQLConnection object

	URL ==> "jdbc:oracle:thin:@198.21.141.5:1521/adobe_db"

	getConnection() creates OracleConnection object	


3) Send SQL statements to database
	3.1) Statement
		IF SQL is fixed / doesn't get changed for different users
		"select * from employees"

	3.2) PreparedStatement
		IF SQL takes IN parameter [ ? ]

		"select * from accounts where userid = ? and password = ?"

		Avoid using:
		"select * from accounts where userid = '" + u + "' and  password = '" + pwd + "'"		
		https://owasp.org/www-project-top-ten/

		String query = "SELECT * FROM accounts WHERE custID='" + request.getParameter("id") + "'";

		http://example.com/app/accountView?id=' or '1'='1

	3.3) CallableStatement
		to invoke Stored Procedure
	Java: call UpdateCourse("Java")

	CREATE OR REPLACE Procedure UpdateCourse ( name_in IN varchar2 )
	IS
  		 cnumber number;
	   cursor c1 is
   SELECT course_number
    FROM courses_tbl
    WHERE course_name = name_in;

BEGIN

   open c1;
   fetch c1 into cnumber;

   if c1%notfound then
      cnumber := 9999;
   end if;

   INSERT INTO student_courses
   ( course_name,
     course_number )
   VALUES
   ( name_in,
     cnumber );

   commit;

   close c1;

EXCEPTION
WHEN OTHERS THEN
   raise_application_error(-20001,'An error was encountered - '||SQLCODE||' -ERROR- '||SQLERRM);
END;

==============

4) ResultSet ==> Cursor to fetched records from database tables

5) Close the connection and other resources in "finally" block

	try {

		} catch(SQLException ex) {

		} finally {
			con.close();
		}

	finally block ==> compulsory execute code [ exception occurs or not]

=========

 ResultSet executeQuery(SQL) ==> SELECT statement

  int executeUpdate(SQL) ==> INSERT, DELETE or UPDATE

  0 ==> no records effected  
  n => number of records effected
  -1 ==> SQL fails

  SQLException ==> Backend isssues

  ================

  new DaoException("unable to add product...");

  ex.getMessage();

=============

select * from products;

===========

docker ==> container 

Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.

MySQL terminal:

docker exec -it local-mysql bash


# mysql -u "root" -p
Enter Password: Welcome123

mysql> create database JAVA_3;

mysql> use JAVA_3;

mysql> create table products( id int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), price double, quantity int);

mysql> insert into products values (0, 'iPhone 12', 98000.00, 100);
insert into products( name, price) values ('iPhone 12', 98000.00);

mysql> insert into products values (0, 'Logitech Mouse', 800.00, 100);
mysql> select * from products;

======
use PreparedStatement

Product getProduct(int id) throws DaoException;
SQL = "select id, name, price, quantity from products where id = ?";

void updateProduct(Product p) throws DaoException;
SQL = "update products set price = ?, quantity = ? where id = ?"

=================================================================

Web application Development

---------------------------



A web container is responsible for managing the lifecycle of servlets, mapping a URL to a particular servlet and ensuring that the URL requester has the correct access-rights


Servlet ==> Server side Java code running within Servelt container / web container

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

}

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

}


request --> object encapsulates all the information coming from client
response ==> object is used to write data back to client

============

Servlet Container / Web Container / Servlet engines ==> Tomcat, Jetty

Eclipse Jetty is a Java web server and Java Servlet container.

==============================

HTTP Request ==> using URL we map URL to Servlet

HTTP Method of Request: GET, POST, PUT, DELETE, PATCH, 

GET: 
==> Address bar and Hyperlink
==> No Payload

POST: Form data submit
Payload will be sent to server
==> to create a resource on server // insert a row in database

PUT: to modify a record
contains payload

DELETE : delete a record on server
No Payload

=========================================





@WebServlet("/product")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		// logic
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		// logic
	}
}


=================

Servlet Container / Engine can create objects if class is of type "HttpServlet"

HttpServlet extends GenericServlet implements Servlet interface

Servlet interface has all the method declarations [ get, post, options, service,.. ]

HttpServlet

	public void service(HttpServletRequest req, HttpServletResponse res) {
		String method = req.getMethod();
		switch(method) {
			case GET:
				public void doGet(req,res); break;
			case POST:
				public void doPost(req,res); break;

	}
====================================
Web applications are deployed on conatiner in the form of "war" not "jar"
war ==> Web Archive

<packaging>war</packaging>

database.war

===========


<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>provided</scope>
</dependency>

HttpServlet, HttpServletRequest, HttpServletResponse, .... are not a part of java apis



<scope>provided</scope> 

I use this to develop; don't include this in "war" bundle; target server has this

==========

<scope>test</scope> ==> i am using this only for testing ; not a part of production

===========

<plugin>
		<groupId>org.eclipse.jetty</groupId>
		<artifactId>jetty-maven-plugin</artifactId>
		<version>9.3.7.v20160115</version>
</plugin>

This is going to include "jetty" as servlet container; Need not install seperatly in machine

=========

<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>2.3</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
</plugin>

tHIS PLUGIN creates "war" file

<failOnMissingWebXml>false</failOnMissingWebXml> ==> not using "web.xml"

"web.xml" is deployment descriptor for web application

web.xml before: 2.5 version of Servlet API

<servlet>
	<servlet-name>A</servlet-name>
	<servlet-class>com.adobe.prj.web.LoginServlet</servlet-class>
</servlet>

<servlet-mapping>
	<servlet-name>A</servlet-name>
	<url-pattern>/login</url-pattern>
</servlet-mapping>

Now we use : @WebServlet("/login")

=======

Run As => MAven Build

Goals ==> jetty:run  ==> Click on "Run" Button

=====================

jetty:run -Djetty.port=9999



