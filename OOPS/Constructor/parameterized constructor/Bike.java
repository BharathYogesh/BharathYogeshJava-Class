package com.Construcor_Paramaterized.Parameterized_Constructor;

public class Bike {

		String name;
		String color;
		int cc;


		Bike(String name1,String color1,int cc1) 
		{
		System.out.println("I am parameterized ");
		name=name1;
		color=color1;
		cc=cc1;

		}


		public static void main (String arg[])
		{
			Bike bike = new Bike("ns","pewtergrey",200);

			System.out.println(bike.name);
			System.out.println(bike.color);
			System.out.println(bike.cc);
			
			
		}
		}
