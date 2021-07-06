package codeWars;

public class challenge3 {

	public static void main(String[] args) {
		System.out.println(highAndLow("1 2 -3 4 5"));

	}
	
	public static String highAndLow(String numbers) {
		boolean highestNum = false;
		int numH = 0;
		boolean lowestNum = false;
		int numL = 0;
        String[] numbersArray = numbers.split(" ");
		for(String number: numbersArray) {
			//Higher
			int intNumber = Integer.parseInt(number);
			if(! highestNum) {
				highestNum = true;
				numH = intNumber;
			} else {
				if(intNumber> numH) {
					numH = intNumber;
				}
			}
			//Lower
			if(! lowestNum ) {
				lowestNum = true;
				numL = intNumber;
			} else {
				if(intNumber < numL) {
					numL = intNumber;
				}
			}
		}
		
		
	    return numH + " " + numL;
	  }

}
