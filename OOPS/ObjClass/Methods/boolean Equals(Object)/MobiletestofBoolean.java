package com.ObjClass.Methods.BooleanEqualsMethods;

public class MobiletestofBoolean {

public static void main(String args[])
{
	Mobile vivo= new Mobile("vivo","android");
	Mobile oopo= new Mobile("oppo","android");
	Mobile apple= new Mobile("apple","android");
	Mobile oneplus= new Mobile("onepus","android");
	
	System.out.println(vivo.equals(apple));
}

}
