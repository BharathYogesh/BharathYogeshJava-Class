package com.ObjClass.Methods;

public class LaptopTestHashCode {

	
	public static void main(String args[])
	{
		Laptop hpLaptop = new Laptop();
		int hpLaptopHashCode =hpLaptop.hashCode();
		System.out.println("Hash code of hp : "+hpLaptopHashCode);
		
		
		Laptop appleLaptop = new Laptop();
		int appleLaptopHashCode =appleLaptop.hashCode();
		System.out.println("Hash code of apple : "+appleLaptopHashCode);
		
		
		
		
		
	}
}
