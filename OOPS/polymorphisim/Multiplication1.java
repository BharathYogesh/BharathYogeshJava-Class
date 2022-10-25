package com.Oops_Polymorphism_Method_Overloading.Changing_datatypes;

public class Multiplication1
{

	public static int add(int x,int y)
	{
		int multi = (x*y);
		return multi;
				
	}
	
	public static double multi(double m,double n)
	{
		double multi =(m*n);
		return multi;
	}

public static void main (String args[])
{
	System.out.println(multi(10,10));
	System.out.println(multi(120.0,203.23));

}
}

