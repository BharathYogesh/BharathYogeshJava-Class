package com.Construcor_Paramaterized.Parameterized_Constructor;

public class Flower {
String name;
String color;
int petals;


Flower(String name1,String color1,int petals1) 
{
System.out.println("I am parameterized ");
name=name1;
color=color1;
petals=petals1;

}


public static void main (String arg[])
{
	Flower flower = new Flower("Jasmiine","White",25);

	System.out.println(flower.name);
	System.out.println(flower.color);
	System.out.println(flower.petals);
}
}
