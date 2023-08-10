package Constructif;
import java.util.Scanner;
public class Constructapp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		System.out.println("Welcome to KodNest");
		System.out.println("        ");
		techClub(marks);
		timeAlot(marks);
		
	}
	public static void techClub(int marks) {
		if (marks>=80) {
			System.out.println("Welcome to Tech Club");
					}
		
		}
	public static void timeAlot(int marks) {
		if (marks>=80) {
			System.out.println("Come with KodNest t-shirt at 6pm");
		
	}
	}
}

