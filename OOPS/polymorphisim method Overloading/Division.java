package com.Oops_Polymorphism_Method_Overloading;

public class Division {

public static int div(int b, int c)
{
	int div = (b/c);
	return div;
			
}

public static  int div1(int s,int p)
{	
	int div1=(s/p);
	return div1;
}

public static void main (String args[])
{
System.out.println(div(100,2));
System.out.println(div1(100,50));

}
}

