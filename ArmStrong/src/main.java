import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     
	        System.out.println("Enter a Number");
	        int num = scan.nextInt();
	        int digi = theCounting.countdigits(num);
	        
	        System.out.println("The Digits are: " + digi);
	        
	        boolean res= armStrongNumber.armStrongNumber(num,digi);
	        
	        if (res==true) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }
	}

	


