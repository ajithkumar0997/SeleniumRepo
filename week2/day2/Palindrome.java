package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="madam";
String textrev="";
for(int i=0;i<text.length();i++) {
	textrev=textrev+text.charAt(i);
	
}
if(text.equals(textrev)) {
	System.out.println(text+" is palindrome");
	
}
	}

}
