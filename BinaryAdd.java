
public class BinaryAdd {

	public static void main(String[] args) {
		String x = "0110111", y = "10101110";

		int num1 = Integer.parseInt(x, 2);
		System.out.println(num1);

		int num2 = Integer.parseInt(y, 2);
		System.out.println(num2);
		
		int sum = num1 + num2;
		System.out.println(sum);

		String result = Integer.toBinaryString(sum);
		System.out.println("Sum of Binary Numbers are: " + result);
	}

}
