package com.Array_jaggedArray;

public class ShortjaggedArray {
	public static void main(String args[])
	{
		short arr[][]= new short[5][];
		arr[0] = new short[3];
		arr[1] = new short[4];
		arr[2] = new short[2];
		arr[3] = new short[1];
		arr[4] = new short[1];
		
		short count=1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=count++;
				
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

