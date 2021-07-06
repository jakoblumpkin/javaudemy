package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
       private int i = 0;
       private int j = 0;
       
       Lock lockForI = new ReentrantLock();
       Lock lockForj = new ReentrantLock();

       public void incrementI() {
	   lockForI.lock();//Get Lock For I
	   i++;
	   lockForI.unlock();
	   //Release Lock For I
    	   
    	  
    	   //get i
    	   //increment
    	   //set i
       }
       
      public int getI() {
    	   return i;
       }
      
      public void incrementJ() {
	   lockForj.lock();//Get Lock For J
	   j++;
	   lockForj.unlock();//Release Lock For J

   	   //get J
   	   //increment
   	   //set J
      }
}
