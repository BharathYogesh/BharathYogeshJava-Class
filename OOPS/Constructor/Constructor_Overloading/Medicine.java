package com.Construcor.Overloading;

public class Medicine {
	String name;
	String company;
	int price;
	int dosage;
	
	Medicine()
	{
		System.out.println("I am default constructor");	
		
	}

	
	Medicine(String name1,String company1,int price1)
	{
		System.out.println("I am parameterized constructor");
		name=name1;
		company=company1;
		price=price1;
		
	}

	public static void main (String args[])
	{
	Medicine medicine = new Medicine();
	System.out.println(medicine.name);
	
	
	Medicine dolo = new Medicine("dolo","john",25);
	System.out.println(dolo.name);
	System.out.println(dolo.company);
	System.out.println(dolo.price);
	
	
	Medicine doxy = new Medicine("doxy","tata",65);
	System.out.println(doxy.name);
	System.out.println(doxy.company);
	System.out.println(doxy.price);
	}
}

