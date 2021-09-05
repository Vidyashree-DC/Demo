class Logicaloperators{
public static void main(String[] args){
int a,b,c;
boolean d,e;
a=10;
b=20;
c=30;
d=(a>b)&&(c<b);
System.out.println(" (a>b)&&(c<b) are : " +d);
d=(a>b)||(c<b);
System.out.println(" (a>b)||(c<b) are : " +d);
d=(a<b)&&(c>b);
System.out.println(" (a<b)&&(c>b) are : " +d);
d=(a<b)||(c>b);
System.out.println(" (a<b)||(c>b) are : " +d);
}
}