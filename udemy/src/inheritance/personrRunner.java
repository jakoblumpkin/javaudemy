package inheritance;
import java.util.ArrayList;
import java.util.List;
///Code war challenge

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
		
		
		System.out.println(findSquares(32));
	}

}
