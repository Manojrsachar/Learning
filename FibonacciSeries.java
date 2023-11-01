//In fibonacci series, next number is the sum of previous two numbers

package Part1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int i = 1;
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		FibonacciSeries(n1, n2, n3, i, count);

	}

	public static void FibonacciSeries(int n1, int n2, int n3, int i, int count) {
		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
