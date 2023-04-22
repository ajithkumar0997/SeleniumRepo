package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> number=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			number.add(data[i]);
		}
		System.out.println(number);
	List<Integer> Largestnumber=new ArrayList<Integer>(number);
	System.out.println(Largestnumber);
	int Size=Largestnumber.size();
	int a=Size-2;
    System.out.println(Largestnumber.get(a));
	}
	}

