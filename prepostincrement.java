class prepostincrement
{
public static void main (String args[]){
int a=10;
int b=a++;
int c=(--b)+(--a);


c++;
++a;
b--;

System.out.println(a--);//11
System.out.println(b+c);//28
System.out.println(--b);//7
System.out.println(b+c);//27
}
}


//a=11
//b=8
//c=20