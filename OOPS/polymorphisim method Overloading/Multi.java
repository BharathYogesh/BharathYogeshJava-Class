package com.Oops_Polymorphism_Method_Overloading;

public class Multi {               //static 

	public static int add(int x,int y)
	{
		int multi = (x*y);
		return multi;
				
	}
	
	public static int multi(int m,int n)
	{
		int multi =(m*n);
		return multi;
	}

public static void main (String args[])
{
	System.out.println(multi(10,10));
	System.out.println(multi(120,203));

}
}




