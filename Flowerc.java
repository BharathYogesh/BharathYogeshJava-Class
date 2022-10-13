class Flower

{
String name;
String colour;
String noOfpetals;

void SheddingFragrance(){
System.out.println(name+" "+colour+" "+noOfpetals+" is SheddingFragrance...!");
}


void blooming(){
System.out.println(name+" "+colour" "+noOfpetals+"  is blooming...!");
)

public static void main(String args[]){

Flower rose= new Flower();

rose.name="Rose";
rose.colour="Red";
rose.noOfpetals=12;

Flower jasmine=new Flower();
jasmine.name="Jasmine";
jasmine.colour="white";
jasmine.noOfpetals=21;

rose.blooming();
rose.sheddingFragrance();
 
 jasmine.blooming();
 jasmine.sheddingFragrance();
}
}