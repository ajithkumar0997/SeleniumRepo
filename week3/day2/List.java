package week3.day2;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  java.util.List<String> list=new ArrayList<String>();
  list.add("Alpha");
  list.add("Sigma");
  list.add("Shrikanth");
  list.add("Delta");
  list.add("Gamma");
  list.add("Shilpa");
for (int i=0;i<list.size();i++) {
	String listnames=list.get(i);
	if(listnames.startsWith("S")) {
		System.out.println(listnames);
	
	}
}
  list.add("Pie");
  int size = list.size();
  System.out.println(size);
  list.add("Pie");
  int size2 = list.size();
  if (size2!=size) {
	  System.out.println("Size changed");
	  
  }
  else {
	  System.out.println("Size still same");
	  
  }
  list.add(3, "Choco");
  list.set(1, "Zudio");
  list.remove("Pie");
  System.out.println(list);
	}

}
