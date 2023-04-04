package week1.day2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] num={1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
	int count = 0;
	for(int i=0;i<=num.length-1;i++) {
		if(num[i]==5)
		{
			count++;
			
		}
		}
	System.out.println(count);
	}

}
