package inheritanceCodewar;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

///Code war challenge
//https://www.codewars.com/kata/60908bc1d5811f0025474291/train/java
public class personrRunner {

	public static String findSquares(int n){
		int num1;
		int num2;
        boolean number1 = false;
        boolean number2 = false;

	    for(int i = 4; i<= 50; i++) {
	    	double square = Math.sqrt( (double) i);
	    	double floor = Math.floor(square);
	    	
	    	if(floor * floor == (double) i) {
	    		System.out.println(i);
	    	}
	    }
	    
		
		return "+" + n;
    }

	public static void main(String[] args) {
		Employee jakob = new Employee("blue", "IBM", "AA", "40,000");
		
		
		//System.out.println(findSquares(32));
		
		//Convert list to LinkedHashSet
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		Set<Character> Result = new LinkedHashSet<Character>(characters);
		System.out.println(Result);
	}

}
