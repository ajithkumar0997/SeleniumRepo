package week1.day1;



public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1=0,num2=1,sum;
         for( int i=1;i<=11;i=i+1) {
        	sum=num1+num2;
        	num1=num2;
        	num2=sum;
        	 System.out.println(sum);
         }
	}

}

