class Student
{
 String name;
 String college;
 String branch;
 int rollNo;
 String dob; 
   
void studying()
{
System.out.println(name+" "+college+" "+branch+" "+rollNo+" "+dob+" is Studying..!");
}

public static void main (String args[]){

Student Bharath= new Student();

Bharath.name="Bharath";
Bharath.college="vkit";
Bharath.branch="mechanical";
Bharath.rollNo=002;
Bharath.dob="11-09-1997";

Bharath.studying();
}
}