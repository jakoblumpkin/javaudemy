package concurrency;

public class Counter {
       private int i = 0;

       synchronized public void incrementJ() {
    	   j++;
    	   //get j
    	   //increment
    	   //set j
       }
       
       public int getJ() {
    	   return j;
       }
}
