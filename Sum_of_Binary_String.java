package Basic_Programs;

import java.util.Scanner;

public class Sum_of_Binary_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		String x = scan.next();
		String y = scan.next();

		int num1 = Integer.parseInt(x, 2);
		int num2 = Integer.parseInt(y, 2);
		int sum = num1 + num2;
		String result = Integer.toBinaryString(sum);
		System.out.println("Sum is " + result);

	}

}
