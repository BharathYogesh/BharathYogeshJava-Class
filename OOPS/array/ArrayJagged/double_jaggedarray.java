package com.Array_jaggedArray;

public class double_jaggedarray {
public static void main(String args[])
{
	double arr[][]= new double[5][];
	arr[0] = new double[5];
	arr[1] = new double[4];
	arr[2] = new double[2];
	arr[3] = new double[1];
	arr[4] = new double[1];
	
	double num=10.0;
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			arr[i][j]=num;
			num=20.0+num;
		}
	}

	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}