package com.TypeCasting.Upcasting;

public class Mobile_Iphone_Upcasting {

	public static void main(String args[])
	
	{
		//Mobile iphone = new Mobile();  
	    Mobile mobile= new Iphone();
		Iphone iphone = (Iphone) mobile();
		
	}
	
	
}
