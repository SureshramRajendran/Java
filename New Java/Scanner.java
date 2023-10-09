import java.util.Scanner;

class Scan {
public static void main(String[]args){
int a,b,c;
System.out.println("Enter 2 numbers");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=a+b;
System.out.println("a+b= "+c);
}
}