package com.Abstraction.LooseCuplings;

public class TestOfFuel {

	
	
	public static void main (String args[])
	{
		Ns200 ns200 = new Ns200();
		Innova innova = new Innova();
		
			Vehicle vehicle = new Vehicle();
			vehicle.tank(innova);
			vehicle.tank(ns200);
	}
}
