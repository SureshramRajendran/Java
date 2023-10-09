package com.onesoft.interview;

public class AcronymString {
	public static void main(String[]args) {
		
		
		String a="Cross Orgin Resource Sharing";
		String[] b=a.split(" ");
		for(String x:b) {
			System.out.println(x.charAt(0));
		}
		for(int i=0;i<=b.length-1;i++) {
			System.out.println(b[i].charAt(0));
		}
		
//		int c=a.length()/2;
//		String q="";
//		String w="";
//		for(int i=0;i<a.length();i++) {
//			if(i<c) {
//				q=q+Character.toLowerCase(a.charAt(i));
//			}
//			else {
//				w=w+Character.toUpperCase(a.charAt(i));
//			}
//		}
//		System.out.println(q+w);
		
//		int s=b.length/2;
//		String z="";	
//		String v="";
//		for(int i=0;i<b.length;i++) {
//			if(i<s) {
//			z=z+Character.toLowerCase(a.charAt(i));
//			}
//			else {
//				v=v+Character.toUpperCase(a.charAt(i));
//		}
//		}
//	System.out.println(z+v);
//		
	}

}
