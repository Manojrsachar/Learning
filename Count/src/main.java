
import java.util.Scanner;
public class main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number");
int num=scan.nextInt();
Counting theCounting=new Counting();
int digi = theCounting.countdigits(num);
System.out.println("number of digits in "+num+" is "+digi);
}
}

