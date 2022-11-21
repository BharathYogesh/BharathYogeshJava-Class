package com.TypeCasting.downcasting;

public class PenBritedownTesting {

	public static void main(String args[])
	{
		Pen pen= new Brite();
		Brite brite= (Brite) pen;    //brite samll word
		
		brite.smooth();
		brite.forwriting();
	}
	
	
}
