package com.Construcor.Overloading;

public class Car {
		String name;
		String company;
		double price;
		double cc;
		
		Car()
		{
			System.out.println("I am default constructor");	
			
		}

		
		Car(String name1,String company1,double price1)
		{
			System.out.println("I am parameterized constructor");
			name=name1;
			company=company1;
			price=price1;
		
		}		
			
			Car(String name1,String company1,int price1,double cc1)
			{
				System.out.println("I am parameterized constructor");
				name=name1;
				company=company1;
				price=price1;
				cc=cc1;		
		
		}

		public static void main(String args[])
		{
		Car car = new Car();
		System.out.println(car.name);
		
		
		Car innova = new Car("innova","toyota",3100000);
		System.out.println(innova.name);
		System.out.println(innova.company);
		System.out.println(innova.price);
		
		
		Car fortuner = new Car("fortuner","toyota",6532500,2700);
		System.out.println(fortuner.name);
		System.out.println(fortuner.company);
		System.out.println(fortuner.price);
		System.out.println(fortuner.cc);
		}
	
}
