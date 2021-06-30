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
		
		int sum123 = number1 + number2;
		System.out.println("The sum of those numbers are - " + sum123);

	}

}
