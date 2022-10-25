package com.Oops_Polymorphism_Method_Overloading.Changing_datatypes;

public class Adder2
{

		 public static int add (int a,int b) 
		 {
			 
			 int sum=(a+b);
			 return sum;
		 }
		 
		public static double add1(double a,double b,double c)
		{
			
			double sum =(a+b+c);
			return  sum;
		}


		public static void main (String args[])
		{
			
			System.out.println(add(10, 100));
			System.out.println(add1(10.2,10.0,10.2));
		}	
		}
