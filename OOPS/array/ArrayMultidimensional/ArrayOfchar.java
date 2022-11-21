package com.Array_MultiDimensional;

public class ArrayOfchar{

	public static void main(String args[])
     {
		char arr[][]=new char[5][5];
		char name='a';
		char a;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) 
			{
				arr[i][j]=name;
			
		}
     }
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
}
}
}