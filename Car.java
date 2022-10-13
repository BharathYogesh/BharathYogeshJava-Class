class Car{
	
String brand;
String name;
String colour;
String price;
String bhp;
String capacity;
String milage;

void luxuries(){
System.out.println(brand+" "+name+" "+colour+" "+price+" "+bhp+" "+capacity+" "+milage+" luxuries");
}

public static void main(String args[]){
 
 Car innova = new Car();
 
 innova.brand="Toyota";
 innova.name="Innova";
 innova.colour="Glassy white";
 innova.price="2900000 rs only";
 innova.bhp="124p";
 innova.capacity="7 memebers";
 innova.milage="15 l/km";
 
 innova.luxuries();
 
 
Car fortuner = new Car();

fortuner.brand="Toyota";
fortuner.name="crysta";
fortuner.colour="Black";
fortuner.price="3800000 rs only";
fortuner.bhp="165bhp";
fortuner.capacity="8 memebers";
fortuner.milage="12 l/km";

fortuner.luxuries();

}
}


