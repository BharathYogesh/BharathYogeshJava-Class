package com.Construcor.Constructor_Chaining;

public class Watch
{
String name;
String colour;
int price;


Watch(String name ){
	System.out.println("I am default constructor");
	this.name=name;
}

	Watch(String name ,String colour)	
{
	System.out.println("I am parameterized");
	this.name=name;
	this.colour=colour;	
	}
   }
