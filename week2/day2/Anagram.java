package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1="stops";
		String text2="potss";
		char[] ctext1= {};
		char[] ctext2= {};
	  if(text1.length()==text2.length()) {
		   ctext1=text1.toCharArray();
		   ctext2=text2.toCharArray();
	   
	  Arrays.sort(ctext1);
	  Arrays.sort(ctext2);
	  
	  
	  boolean equals = Arrays.equals(ctext1,ctext2);
	  if(equals) {
		  System.out.println("both text has same values");
	  }
	  else {
		  System.out.println("both  text has different values");
	  }
	}
	  else {
		  System.out.println("both  text has different values");
	  }
	}
}


