import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calcuateFactorial(n);

	}
	public static void calcuateFactorial(int n) {
		int v=1;
		for(int i=1;i<=n;i++){
			v=v*i;	
			}
		System.out.println(v);
		
	}

}
