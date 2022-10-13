class Flower
{
String name;
String colour;
int noOfpetals;

void sheddingFragrance(){
System.out.println(name+" "+colour+" "+noOfpetals+"  is shedding fragrance...!");
}

void blooming(){
System.out.println(name+" "+colour+" "+noOfpetals+"  is blooming...!");
}

public static void main (String args[])
{

Flower jasmine = new Flower();

jasmine.name="Jasmine";
jasmine.colour="White";
jasmine.noOfpetals=19;
 
jasmine.noOfpetals();
jasmine.blooming();
jasmine.sheddingFragrance();
}
}