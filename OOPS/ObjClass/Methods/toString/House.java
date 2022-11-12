package com.ObjClass.toString;

public class House {
String type;
String price;
int acres;


public 	House(String type,String price,int acres) {
	this.acres=acres;
	this.price=price;
	this.type=type;
}

@Override

public String toString()
{
	return "House[type="+type+" ,price = "+price+" acres="+acres+"]";
}


}