package com.ObjClass.Methods;

public class WheelTestDemo {
public static void main(String args[])
{
	Wheel carWheel =new Wheel();                                                        //create one or more objects to  get the integer hashcode//
	int carWheelHashCode= carWheel.hashCode();                                              //exp//  //like wheel of car,bike,bus,etc //
	System.out.println("hash code of car: "+carWheelHashCode);                                     // not only wheels we take any objects//
	
	Wheel bikeWheel =new Wheel();
	int bikeWheelHashCode= bikeWheel.hashCode();
	System.out.println("hash code of bike: "+bikeWheelHashCode);
	
}
}
