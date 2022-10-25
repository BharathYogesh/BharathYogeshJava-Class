package com.Oops_Polymorphism_Method_Overloading;

public class Sub1 {
                                                                                //in_statnce method
	public int sub(int a,int b)
	{
		int sub=(a-b);
		return sub;
	}
	
	
	
	public int sub1(int x, int y)
	{
	
		int sub=(x-y);
		return sub ;
	}

public static void main (String args[])
{
	
	Sub1 sub1= new Sub1();
     System.out.println(sub1.sub(30, 200));
     System.out.println(sub1.sub(300, 200));
}
}