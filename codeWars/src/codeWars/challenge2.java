package codeWars;
//https://www.codewars.com/kata/546e2562b03326a88e000020/solutions/java

public class challenge2 {
	
	public static int squareDigits(int n) {
		String finalString = "";
		String number = Integer.toString(n);
	    for(int i = 0; i < number.length(); i++) {
	    int num = Integer.parseInt(String.valueOf(number.charAt(i)));
	    String num1 = Integer.toString(num * num);
	    finalString = finalString + num1;
	    }
	    return Integer.parseInt(finalString);
	  }


	public static void main(String[] args) {
		System.out.println(squareDigits(9119));

	}

}
