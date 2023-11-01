package Part1;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int fact = 1;
		System.out.println("Enter the Number");
		int number = scan.nextInt();

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
