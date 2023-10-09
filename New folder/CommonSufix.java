package com.onesoft.interview;

public class CommonSufix {
	public static void main(String[]args) {
	String name[] = {"Ram", "SureshRam", "RamKumar"};
	  String word="";
	  
	  for(int i=name.length-1;i>=0;i--) {
		  if(word.equals("")) {
			  word=name[i];
		  }
		  else if(!name[i].contains(word)) {
			  word="";
		  }
	  }
	  System.out.println(word);
	}
}
