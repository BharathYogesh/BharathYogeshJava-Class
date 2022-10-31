package Constructor;

public class Mobile 
{
String name;
String color;
double size;
double price;


Mobile()
{
	System.out.println("default");
	name="1 plus";
	color="white";
	size= 6.75;
	price=65000;	
}
 public static void main(String args[])
 {
	  Mobile mobile = new Mobile();
	System.out.println("Mobile name : "+mobile.name);
	System.out.println("Mobile color : "+mobile.color);
	System.out.println("Mobile size : "+mobile.size);
	System.out.println("Mobile price : "+mobile.price);
 }

}
