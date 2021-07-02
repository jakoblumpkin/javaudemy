package codeWars;
//https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0/train/java
import java.util.ArrayList;

public class challenge1 {
    
	public static int[] solve(String[] arr){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        int[] finalA = new int[arr.length];
        
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
			finalA[i](count);
		}
		
		return finalA;

    }
	public static void main(String[] args) {
		solve(new String[]{"abode","ABc","xyzD"});
	}

}
