package com.Oops_Polymorphism_Method_Overloading;

public class Subtraction
{
 
	 static int sub(int a, int b) {
		
		int sub=(a-b);                                                           //static method
	
		return sub;
	
	}
	
 static int sub1(int a, int b)
{
	int sub=(a-b);
	return sub;
	
}

public static void main(String args[])
{
	
     
     System.out.println(sub(10,8));
     System.out.println(sub1(320,8));
     
}
}