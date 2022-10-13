class bitwiseandor
{
public static void main (String args[]){

int a=210;
int b=324;
int c=310;

boolean result=(a>b)&(b>--c);
boolean result1=(a>b)|(b<c);

System.out.println(result);

System.out.println(result1);

}
}