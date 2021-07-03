package Thread;

//extends Thread
//implements Runnable

class Task1 extends Thread {
	public void run() {//SIGNATURE
		System.out.println("\nTask1 Started");

		for(int i = 101; i<=199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task1 Done");
	}
}

class Task2 implements Runnable {
	
	@override
	public void run() {
		System.out.println("\nTask2");
		
		for(int i = 201; i<=299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task2 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		//Task1 - 101 to 109
		System.out.print("\nTask1 Kicked Off");
         Task1 task1 = new Task1();
         task1.start(); //task1.run()
         
         System.out.print("\nTask2 Kicked Off");
		//Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
  
		System.out.print("\nTask1 Kicked Off");
		//Task3
		for(int i = 301; i<=399; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n Task3 Done");
		
		System.out.print("Main Done");

	}

}
