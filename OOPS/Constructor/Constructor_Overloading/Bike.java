package com.Construcor.Overloading;

public class Bike {

String name;
String company;
double price;
double cc;

Bike()
{
	System.out.println("I am default constructor");	
	
}


Bike(String name1,String company1,double price1)
{
	System.out.println("I am parameterized constructor");
	name=name1;
	company=company1;
	price=price1;

}		
	
Bike(String name1,String company1,int price1,double cc1)
	{
		System.out.println("I am parameterized constructor");
		name=name1;
		company=company1;
		price=price1;
		cc=cc1;		

}

public static void main(String args[])
{
Bike bike = new Bike();
System.out.println(bike.name);


Bike ns200 = new Bike("ns200","bajaj",194000);
System.out.println(ns200.name);
System.out.println(ns200.company);
System.out.println(ns200.price);


Bike bullet = new Bike("bullet","Royal Enfield",280000,2700);
System.out.println(bullet.name);
System.out.println(bullet.company);
System.out.println(bullet.price);
System.out.println(bullet.cc);
}

}

