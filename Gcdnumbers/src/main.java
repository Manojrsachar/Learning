import java.util.Scanner;

public class main {
	public static void findGCD(int m, int n) {
	//int rem = 0;
	{		
		while(n!=0)
		{
		int rem=m%n;
		m=n;
		n=rem;
		}

	System.out.println("Gcd Value is "+m);
	}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter m and n value");
		int m=scan.nextInt();
		int n=scan.nextInt();
		findGCD(m,n);
	}
	}


