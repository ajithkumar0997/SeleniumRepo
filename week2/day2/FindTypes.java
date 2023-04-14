package week2.day2; 

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
		a) Convert the String to character array
		b) Traverse through each character (using loop)
		c) Find if the given character is what type using (if)
				i)  Character.isLetter
				ii) Character.isDigit
				iii)Character.isSpaceChar
				iv) else -> consider as special character
	*/
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for(int i=0; i<test.length();i++) {
			char chartest=test.charAt(i);
			 if(Character.isLetter(chartest)){
				 letter++;
			 }
			 else if(Character.isDigit(chartest)) {
				 num++;
		}
			 else if(Character.isSpaceChar(chartest)) {
				 space++;
			 }
			 else {
				 specialChar++;
			 }
	}
System.out.println("number of letters are"+" "+letter);
System.out.println("number of numbers are"+" "+num);
System.out.println("number of spaces are"+" "+space);
System.out.println("number of special chars are"+" "+specialChar);
	}

}
