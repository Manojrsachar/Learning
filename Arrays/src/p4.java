import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float base = scanner.nextFloat();

		float height = scanner.nextFloat();

		float area = (base * height) / 2;

		System.out.println("The area of the triangle is: " + area);

}}
