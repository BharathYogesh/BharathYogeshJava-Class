package com.ObjClass.Methods;

public class TestOfMobileHashCode {
public static void main(String args[])
{
	Mobile vivoMobile= new Mobile();
	int vivoMobileHashCode= vivoMobile.hashCode();
	System.out.println("Hash code of Vivo :"+ vivoMobileHashCode);
	
	Mobile oneplusMobile= new Mobile();
	int oneplusMobileHashCode= oneplusMobile.hashCode();
	System.out.println("Hash code of Oneplus :"+ oneplusMobileHashCode);
	
	Mobile appleMobile= new Mobile();
	int appleMobileHashCode= appleMobile.hashCode();
	System.out.println("Hash code of apple :"+ appleMobileHashCode);
	
	
	
	
	
	
	
	
}
}
