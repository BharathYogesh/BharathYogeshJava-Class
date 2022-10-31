package com.Construcor_Paramaterized.Parameterized_Constructor;

public class Mobile {

	String name;
	String color;
	String battery;


	Mobile(String name1,String color1,String battery1) 
	{
	System.out.println("I am parameterized ");
	name=name1;
	color=color1;
	battery=battery1;

	}


	public static void main (String arg[])
	{
		Mobile mobile= new Mobile("1+","Silver","3250mah");

		System.out.println(mobile.name);
		System.out.println(mobile.color);
		System.out.println(mobile.battery);
	}
	}
