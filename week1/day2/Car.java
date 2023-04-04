package week1.day2;

public class Car {
	public void printCarBrand()
	{	
		System.out.println("BMW");
	}
	public int printRegNo()
	{
		return 12345;
	}
	public boolean checkPuncture() {
	           
	            return false;
	}
	public int multiplyNumbers(int a, int b, int c) {
		int d=a*b*c;
		return d;
	}
		public void getModel() {
			System.out.println("BMW_2023");
		}
		public static void main (String[]args) {
			Car obj=new Car();
			obj.printCarBrand();
			int printRegNo = obj.printRegNo();
			System.out.println(printRegNo);
			boolean checkPuncture = obj.checkPuncture();
			System.out.println(checkPuncture);
			int multiplyNumbers = obj.multiplyNumbers(2,3,5);
			System.out.println(multiplyNumbers);
			 obj.getModel();
			
			
			
	}
}
