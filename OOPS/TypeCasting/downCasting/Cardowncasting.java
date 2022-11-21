package com.TypeCasting.downcasting;

public class Cardowncasting {

	public static void main (String args[])
	{
		Car car=new Innova();
		Innova innova=(Innova) car;
		innova.hybridinnova();
		innova.toyota();
	}
}
