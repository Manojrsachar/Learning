import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s1.nextInt();
		int sq = num * num;
		System.out.println(sq);
		String numberString = String.valueOf(sq);
		int res = 0;
		for (int i = 0; i < numberString.length(); i++) {
			char digitChar = numberString.charAt(i);
			int digit = Character.getNumericValue(digitChar);
			res = res + digit;

		}
		System.out.println(res);
		if (res == num) {
			System.out.println("Yes it is Neon Number");
		} else {
			System.out.println(" No its not a Neon Number");
		}

	}

}
