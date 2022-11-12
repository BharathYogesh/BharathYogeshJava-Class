package com.ObjClass.toString;

public class Car {
	String name;
	String price;
	String CC;
	
	
	
	public Car(String name,String price,String CC)
	{
		this.CC=CC;
		this.name=name;
		this.price=price;
	}

                                                //can override to get full details// otherwise we get class with integer
@Override
public String toString()
{
	return "Car[name="+name+",price="+price+" ,CC="+CC+"]";
}
}

