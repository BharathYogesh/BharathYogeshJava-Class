package com.inheritance.method_Overriding;

public class Toyota {
void luxury()
{
	System.out.println("The Cars are luxuries");
}


public static class Innova extends Toyota{
	 void luxury()
{
		System.out.println("Cars are luxuries");
}
	
	public static void main (String args[])
	{
		Innova innova=new Innova();
		innova.luxury();
	}
}
}