package com.TypeCasting.Upcasting;

public class Mango_Tree_UpcastingTest {
                                                                               
	public static void main (String args[])
	{
		
		            Tree tree = new Mango();
		            Mango  mango =(Mango) tree;                  //downncasting//
		            mango.producesOxygen();
		            mango.providesMangoFruit();
		 
		
	}
}