import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Convert the number to a string
		String numberString = String.valueOf(number);

		System.out.println("Digits in the given number:");

		// Iterate through the characters of the string and extract digits
		for (int i = 0; i < numberString.length(); i++) {
			
				char digitChar = numberString.charAt(i);
				// Convert the character back to an integer and print it
				int digit = Character.getNumericValue(digitChar);
				System.out.println(digit);
			
		}
	}

}
