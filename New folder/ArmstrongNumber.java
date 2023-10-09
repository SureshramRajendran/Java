package com.onesoft.interview;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 3 digit number");
		int num=s.nextInt();
		int n1,n2,n3,temp,result;
		temp=num;
		n1=temp%10;
		temp=temp/10;
		n2=temp%10;
		temp=temp/10;
		n3=temp%10;
		temp=temp/10;
		result=(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
		if(num==result) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is Not Armstrong");
		}
		
	}

}
