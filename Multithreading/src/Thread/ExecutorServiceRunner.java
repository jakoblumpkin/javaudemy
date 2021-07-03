package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	
	private int number;

	public Task(int number) {
		this.number = number;
	}
	public void run() {//SIGNATURE
		System.out.println("\nTask1" +number+ "Started");
		
		for(int i = number*100; i<=number * 100 + 99; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask1" + number + "Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
        System.out.println("\n Task3 Kicked Off");
        
      //Task3
      	executorService.shutdown();
	}

}
