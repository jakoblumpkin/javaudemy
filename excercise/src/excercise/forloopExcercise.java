package excercise;

public class forloopExcercise {

	public static void main(String[] args) {
		System.out.println(forLoop(10));

	}
	
	private static int forLoop(int num) {
       int total = 0;
       for(int j = 2; j < num; j++) {
    	   if(num % j==0) {
    		   total = total + j;
    	   }
       }
       return total;
	}

}
