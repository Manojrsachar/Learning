package fibonacci;
import java.util.Scanner;
public class main1{
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter n value");
int n=scan.nextInt();
printFibonacciSeries(n);
}
public static void printFibonacciSeries(int n)
{
	Scanner scan=new Scanner(System.in);
int fib1=0;
int fib2=1;
int count=2;
if(n==1)
{
System.out.println(fib1);
}
else if(n==2)
{
System.out.println(fib1+" "+fib2);
}
else
{
System.out.print(fib1+" "+fib2);
for(int i=3;i<=n;i++)
{
int nextfib=fib1+fib2;
System.out.print(" "+nextfib);
fib1=fib2;
fib2=nextfib;
count++;
//

}
System.out.println(" ");
System.out.println(count);
System.out.println();
}
}
}
