import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		System.out.println("Enter The Power");
		int n=scan.nextInt();
		calculatePowerofn  p2 = new calculatePowerofn ();
		int res=p2.raiseToPowerN(num, n);
		System.out.println(res);
		}
	}
