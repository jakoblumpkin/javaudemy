package excercise;

public class codeWar {

	public static void main(String[] args) {
		System.out.println(findNextSquare(121));
	}
	
	public static double findNextSquare(long sq) {
		
		  double floor = Math.floor(Math.sqrt(sq));
		  double square = Math.sqrt(sq);
		  
		  if (floor == square ) {

		  for(long i = sq+ 1; true; i++) {
			  
		  double number = Math.floor(Math.sqrt((double) i));
	      double total = number * number;
	       if (total == (double) i) {
	    	   return i;
	       }
		  }
		  } else {
			  return -1;
		  }
	  }
}
