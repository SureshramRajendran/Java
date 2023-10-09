package com.onesoft.interview;

import java.util.Arrays;

public class ArrayInAsceDesc {
	public static void main(String[]args) {
		String a="1,2,3,1,2,3";
		String[] b=a.split(",");
		int[] num=new int[b.length];
		
		System.out.println("Ascending");
		
		for(int i=0;i<=b.length-1;i++) {
			num[i]=Integer.parseInt(b[i]);
		}
		for(int i=0;i<=num.length-1;i++) {
			Arrays.sort(num);
			System.out.println(num[i]);
		}
		
		System.out.println("Descending");
		
		for(int i=b.length-1;i>=0;i--) {
			num[i]=Integer.parseInt(b[i]);
		}
		for(int i=b.length-1;i>=0;i--) {
			Arrays.sort(num);
			System.out.println(num[i]);
		}
		
	}

}    
	