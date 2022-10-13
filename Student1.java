class Student1
{
String name;
String dob;
int rollNo;
String branch;
String college;

void studying(){
System.out.println(name+" "+dob+" "+rollNo+" "+branch+" "+college+"  is studying...!");
}

public static void main(String args[]){

Student bharath = new Student();

bharath.name="Bharath";
bharath.dob="11-09-1997";
bharath.rollNo=002;
bharath.branch="mechanical";
bharath.college="vkit";

bharath.studying();

Student yogesh = new Student();
 
yogesh.name="Yogesh";
yogesh.dob="11-09-1992";
yogesh.rollNo=003;
yogesh.branch="civil";
yogesh.college="sjbit";
 
yogesh.studying();   
  
Student prajwal = new Student();
  
prajwal.name="Prajwal";
prajwal.dob="11-02-2004";
prajwal.rollNo=005;
prajwal.branch="eee";
prajwal.college="rnsit";
  
  prajwal.studying();
  
}
}