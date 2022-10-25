package com.Oops_Polymorphism_Method_Overloading;

	public class Adder1 {
		 public int add (int a,int b) {
			 
			 int sum=(a+b);
			 return sum;
		 }


		public int add(int a,int b,int c) {
			
			int sum =(a+b+c);
			return sum ;
		}


		public static void main (String args[])
		{
			Adder adder = new Adder();
			System.out.println(adder.add(1000, 100));
			System.out.println(adder.add(11200,100,102));
		}
			
		}
