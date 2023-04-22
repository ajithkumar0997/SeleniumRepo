package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[]a= {1,5,4,10,8,6,2,3,5};
		Set<Integer> number=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) {
			number.add(a[i]);				
			
		}
		System.out.println(number);
		int b=1;
		for(int eachvalue : number) {
			
			if(eachvalue!=b) {
				System.out.println("Missing value is "+b);
				b++;
			}
			b++;
		}
		
	   
		
		}

		
	}


