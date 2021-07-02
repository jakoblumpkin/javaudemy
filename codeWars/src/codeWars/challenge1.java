package codeWars;

import java.util.ArrayList;

public class challenge1 {
    
	public static void solve(String[] arr){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        ArrayList<Integer> finalA = new ArrayList<>();
        
		for(String group: arr) {
			group = group.toLowerCase();
			int count = 0;
			for (int i = 0; i < group.length(); i++) {
			    char char1 = group.charAt(i);
			    int alphaInt = alphabet.indexOf(char1);
			    if (alphaInt == i) {
			    	count ++;
			    }
			}
			finalA.add(count);
			System.out.println(finalA);
		}

    }
	public static void main(String[] args) {
		solve(new String[]{"abode","ABc","xyzD"});
	}

}
