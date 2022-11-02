package com.Construcor.Overloading;

public class Watch {

		String name;
		String company;
		double price;
		

		Watch()
		{
			System.out.println("I am default constructor");	
			
		}


		Watch(String name1,String company1,double price1)
		{
			System.out.println("I am parameterized constructor");
			name=name1;
			company=company1;
			price=price1;

		}		
			
		Watch(String name1,String company1,int price1)
			{
				System.out.println("I am parameterized constructor");
				name=name1;
				company=company1;
				price=price1;
				

		}

		public static void main(String args[])
		{
		Watch watch =new Watch();
		System.out.println(watch.name);


		Watch smart =new Watch("smart","fastrack",1940);
		System.out.println(smart.name);
		System.out.println(smart.company);
		System.out.println(smart.price);


		Watch sonata = new Watch("sonata","HMT",2700);
		System.out.println(sonata.name);
		System.out.println(sonata.company);
		System.out.println(sonata.price);
		
		}

		}


