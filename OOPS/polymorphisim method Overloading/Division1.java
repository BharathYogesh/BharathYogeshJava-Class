package com.Oops_Polymorphism_Method_Overloading.Changing_datatypes;

public class Division {

public static int div(int b, int c)
{
	int div = (b/c);
	return div;
			
}

public static  double div1(double s,double p)
{	
	double div1=(s/p);
	return div1;
}

public static void main (String args[])
{
System.out.println(div(100,2));
System.out.println(div1(100.2,50.1));

}
}
