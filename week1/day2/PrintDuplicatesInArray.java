package week1.day2;

public class PrintDuplicatesInArray {
	static int[] a={14,12,13,11,15,14,18,16,17,19,18,17,20};
	public static void main(String[] args) {
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-2;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}	
	}
	
