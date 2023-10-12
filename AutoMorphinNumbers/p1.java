import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		int res=num*num;
		System.out.println("Square is "+res);
		int count=0;
		int num1=num;
		while(num1>0) {
			num1=num1/10;
			count++;
		}
		System.out.println("Length of Number "+count);
		int lastDigits = res % (int) Math.pow(10, count);
		if(num==lastDigits) {
			System.out.println("yes "+num+" matches with Lastdigit "+lastDigits);
		}else {
			System.out.println("No !!! "+num+" does not matches with Lastdigit "+lastDigits);
		}
		
		
		

	}

}
