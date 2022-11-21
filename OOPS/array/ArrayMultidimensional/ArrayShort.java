package com.Array_MultiDimensional;

public class ArrayShort {
	
	public static void main (String args[])
	{
		short arr[][]= new short[3][3];
				short num=20;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) 
			{
				arr[i][j]=num;
			}
		}
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println("");
	}

	}
	}

