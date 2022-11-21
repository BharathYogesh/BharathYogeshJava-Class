package com.Array_MultiDimensional;

public class Arrays {
public static void main (String args[])
{
	double arr[][]= new double[3][3];
			double num=10.262;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) 
		{
			arr[i][j]=num;
			num=10+num;
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