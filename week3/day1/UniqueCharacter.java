package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String name="ajithkumar";
	  char[] namechar=name.toCharArray();
	  Set<Character> uniquechar=new LinkedHashSet<Character>();
		 for(int i=0;i<namechar.length;i++) {
			uniquechar.add(namechar[i]);
			
				 }
		
		 for(Character eachvalue : uniquechar) {
			 System.out.println(eachvalue);
		 }
	}

}
