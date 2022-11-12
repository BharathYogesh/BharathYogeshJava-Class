package com.ObjClass.toString;

public class Animal {
String name;
String type;


public Animal(String name,String type)
{
	this.name=name;
	this.type=type;
}


@Override
public String toString() {

return "Animal[name="+name+",type="+type+")";

}
}