package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Anusha kumar";
for(int i=0;i<name.length();i++) {
	char a=name.charAt(i);

	System.out.println(a);
	Map<Integer, Character> map=new LinkedHashMap<Integer, Character>();
	map.put(i, a);
	Set<Entry<Integer,Character>> set=map.entrySet();
	for (Entry<Integer,Character>  eachentry : set) {
		
		Character value = eachentry.getValue();
	//if(eachentry.getValue()) {
		
	}
		
	}
}

	}


