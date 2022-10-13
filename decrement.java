class decrement
{
public static void main (String args[])
{

int x=50;
int y=--x;
int z=y--;
z--;
--y;

System.out.println("x : "+(x--));
System.out.println("y : "+(--y));
System.out.println("z : "+(z--));
System.out.println("z : "+(x+z));


}
}