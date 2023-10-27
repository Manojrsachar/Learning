import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = s1.nextInt();
		int res = 1;
		for (int i = num; i > 1; i--) {
			res = res * i;

		}
		System.out.println(res);

	}

}
