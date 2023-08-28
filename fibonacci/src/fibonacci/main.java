package fibonacci;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter the n");
		int n=scan.nextInt();	
		printFibonacci(n);
		System.out.println();

	}

	public static void printFibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3;
		//count=0;
		 if(n==1) {
			 System.out.println(n1);
		 }
		 else if(n==2){
			 System.out.println(n2);
		 }
		 else {
		 for(int i=3;i<=n;i++) {
			 System.out.print(n1+" "+n2+" ");
		 n3=n1+n2;
		 System.out.print(n3+" ");
		 n1=n2;
		 n2=n3;	
		 //count++;
		 }
		 //System.out.println(n3);
		}
		
	}
}
