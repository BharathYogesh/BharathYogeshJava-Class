package Constructor;

public class Laptop {
String name;
String color;
double size;
	

Laptop()
{
	System.out.println("default");
	name="hp";
	color="dual tone of gold/silver";
	size = 15.6;
	
}


public static class Defaultconstructor4
{
public static void main(String args[])
{
	Laptop laptop = new Laptop();
	System.out.println("Laptop name : "+laptop.name);
	System.out.println("Laptop color : "+laptop.color);
	System.out.println("Laptop size : "+laptop.name);
	
}
}
}