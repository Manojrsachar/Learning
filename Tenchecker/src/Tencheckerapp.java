import java.util.Scanner;
public class Tencheckerapp {

	public static void checkMultipleOfTen(int n) {
		System.out.println("The Number is multiple of Ten");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%10==0)
		{
			checkMultipleOfTen(n);
		}

	}

}
