package com.Array_jaggedArray;

public class StringJaggedarray {

		public static void main(String args[])
		{
			String arr[][]= new String[5][];
			arr[0] = new String[3];
			arr[1] = new String[4];
			arr[2] = new String[2];
			arr[3] = new String[1];
			arr[4] = new String[1];
			
			String name="Bharath";
			
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr[i][j]=name;
					
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

