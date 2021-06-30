package excercise;

import java.util.Scanner;

public class inpur {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter Number2: ");
		int number2 = scanner1.nextInt();
		
		System.out.println("Choices Available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter Number3: ");
		int number3 = scanner2.nextInt();
	    
		System.out.println("Number 1: " + number1);
		System.out.println("Number 1: "+ number2);
		System.out.println("choice: " + number3);
		
		if (number3 == 1) {
			System.out.println("Sum: " + number1 + number2);
		}
		
		if (number3 == 2) {
			System.out.println("Substraction: " + (number1 - number2));
		}
		
		if (number3 == 3) {
			System.out.println("Division: "+ (number1 / number2));
		}
		
		if (number3 == 4) {
			System.out.println("Multiplication: "+ (number1 * number2));
		}

	}

}
