package com.Array_MultiDimensional;

public class Array_StringMultipleArray {
public static void main (String args[])
{
	String arr[][]=new String[4][4];
	 String name="Bharath";
	 int count =0;
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr.length;j++) {
			 arr[i][j]=name;
		 }}
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr.length;j++) {
			 System.out.print(arr[i][j] +" ");
		 }
		 System.out.println("");}}}
	 



