package collections;

import java.util.HashMap;
import java.util.Map;

public class mapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + 
	             "This has never happened before.";
		
		Map<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		for(char character: characters) {
			Integer integer = occurances.get(character);
			if(integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}
		
		System.out.println(occurances);
		
		String[] stringList = str.split(" ");
		Map<String, Integer> stringHash = new HashMap<>();
	
		for(String i: stringList) {
		 Integer j = stringHash.get(i);
		 
		 if(j == null) {
			stringHash.put(i, 1);
		 } else {
			stringHash.put(i, j +1);
		 }
		}
		
		System.out.println(stringHash);
	}

}
