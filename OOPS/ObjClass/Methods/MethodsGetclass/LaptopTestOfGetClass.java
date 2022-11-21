package com.ObjClass.Methods_getclass_Object;

public class LaptopTestOfGetClass {

	
	public static void main(String args[])
			{
		  Laptop laptop= new Laptop("pavilion","hp",21354.75) ;
		  System.out.println(laptop.getClass().getSimpleName());
			}
}
