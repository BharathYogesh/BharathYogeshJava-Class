package com.ObjClass.Methods.BooleanEqualsMethods;

public class BusTestOfBooleanEqulas {
public static void main (String args[])
{
	Bus volvo = new Bus("volvo","diesl");
	Bus scania = new Bus("volvo","diesl");
	Bus volvo1 = new Bus("volvo","diesl");
	Bus seabird = new Bus("seabird","diesl");
	
	System.out.println(volvo.equals(scania));
	System.out.println(volvo.equals(volvo));
	System.out.println(scania.equals(volvo));
	System.out.println(seabird.equals(volvo));
}
}
