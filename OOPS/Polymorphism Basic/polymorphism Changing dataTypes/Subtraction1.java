package com.Oops_Polymorphism_Method_Overloading.Changing_datatypes;

public class Subtraction1
{

		 public static int sub (int a,int b) 
		 {
			 
			 int sub=(a-b);
			 return sub;
		 }
		 
		public static double sub1(double a,double b)
		{
			
			double sub1 =(a-b);
			return sub1;
		}


		public static void main (String args[])
		{
			
			System.out.println(sub(102,10));
			System.out.println(sub1(10.9,10.8));
		}
		}	
		