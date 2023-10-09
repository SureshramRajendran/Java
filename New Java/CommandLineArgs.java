import java.util.Scanner;

class CommandLineArgs {
public static void main(String[]args){
int sum,num1,num2,num3;
//Convert String args[] into Integer
num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
num3=Integer.parseInt(args[2]);

sum=num1+num2+num3;
System.out.println("The sum is "+sum);
}
}