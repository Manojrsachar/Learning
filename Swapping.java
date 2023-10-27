import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=s1.nextInt();
		int n2=s1.nextInt();
		int temp;
		System.out.println("Before Swapping: "+n1+" and "+n2);
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swapping: "+n1+" and "+n2);
	}

}
