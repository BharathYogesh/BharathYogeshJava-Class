package com.ObjClass.Methods.BooleanEqualsMethods;

public class BooksTestOfBooleanEquals {

public static void main(String args[])
{
	Books books= new Books("ruled",300);
	Books books1=new Books("unruled",500);
	
	
	System.out.println(books.equals(books1));
}




}
