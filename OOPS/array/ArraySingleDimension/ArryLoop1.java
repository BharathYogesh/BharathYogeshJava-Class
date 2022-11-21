package com.Array;

public class ArryLoop1 {
public static void main(String args[])
{
	int arr[]=new int[4];
	
	int num=2015;
	 
	 for(int i=0 ; i<arr.length; i++)
	 {
		arr[i]= num;
		num=5+num;
	 }

for(int i=0 ; i<arr.length; i++)
{
	System.out.println(arr[i]);
}
}

}
	