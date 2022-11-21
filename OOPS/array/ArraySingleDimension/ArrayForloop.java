package com.Array;

public class ArrayForloop {
public static void main (String args[])
{
	int arr[]=new int[5];
	                                                                    //[0,1,2,3,4] /// positon
                                                                            
	int num=1;                                                        //position start value holds//
	
	for( int i=0; i<arr.length; i++)
	{
		arr[i]=num;
		num=10+num;
	}
	for( int i=0; i<arr.length; i++)                          //display//
	{
		System.out.println(arr[i]);
	}
	
}
}
