package week1.day2;

import java.util.Arrays;


public class MissingElementInArray {
	 static int[] arr = {1,2,3,4,7,6,8};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Arrays.sort(arr);
		
for(int i=0; i<arr.length;i++) {
	
	if (arr[i]!=(i+1)) {
		System.out.println("Missing number is" +" "+(i+1));
		break;
	}
}
	}

}
