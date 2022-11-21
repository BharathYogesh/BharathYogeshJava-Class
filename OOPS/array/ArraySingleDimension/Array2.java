package com.Array;

public class Array2 {
public static void main (String args[])
{
		int arr[]= {100,200,300,400,500};
		int num=100;
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=num;
			num=100+num;
			
		}
      		
		for(int i=0; i<arr.length;i++)
		{
	     System.out.println(arr[i]);
}
}
}