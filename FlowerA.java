class FlowerA

{
String name;
String colour;
int noOfpetals;

void SheddingFragrance(){
System.out.println(name+" "+colour+" "+noOfpetals+" is Shedding fragrance...!");
}

void blooming(){
System.out.println(name+" "+colour+" "+noOfpetals+"  is blooming...!");
}

public static void main (String args[]){

Flower rose= new Flower();

rose.name="Rose";
rose.colour="Red";
rose.noOfpetals=12;

rose.blooming();
rose.SheddingFragrance();

Flower jasmine= new Flower();

jasmine.name="Jasmine";
jasmine.colour="white";
jasmine.noOfpetals=21;

jasmine.blooming();
jasmine.SheddingFragrance();
 
}
}