package com.onesoft.interview;

import java.util.Arrays;

public class CommonPrefix {
	static String CommonPerfix(String[] a) {
		int len=a.length;
		if(len==0) {
			return"";
		}
		if(len==1) {
			return a[0];
		}
		Arrays.sort(a);
		int end=Math.min(a[0].length(),a[len-1].length());
		int i=0;
		while(i<end && a[0].charAt(i)==a[len-1].charAt(i)) 
			i++;
		String res=a[0].substring(0,i);
		return res;
	}
	      public static void main(String[] args) {
	    	  String name[] = {"AnuKumar", "AnuPriya", "Anuradha"};
	    	  String word="";
	    	  
	    	  for(int i=0;i<name.length;i++) {
	    		  if(word.equals("")) {
	    			  word=name[i];
	    		  }
	    		  else if(!name[i].contains(word)) {
	    			  word="";
	    		  }
	    	  }
	    	  System.out.println(CommonPerfix(name));
		}
	}


