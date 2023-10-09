package com.onesoft.interview;

public class ContinuousEvenNum {
	     public static void main(String[] args) {
			int a[]= {53,88,76,42,19,28};
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					
					count++;
				}
				else {
					count=0;
				}
			if(count==3) {
				System.out.println("True");
		        break;
			}}
			
			if(count<3||count>3) {
			System.out.println("False");
		}
			}
	}


