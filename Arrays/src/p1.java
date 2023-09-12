import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[4];//array instantiation
		
		//Industrial standard array condition for array length
		for(int i=0;i<=arr.length-1;i++)
		//this for loop can also be written  for(int i=0;i<=arr.length-1;i++)
			
		{System.out.print("Enter an "+i+" element: ");
			 arr[i]=scan.nextInt();
		}
		System.out.println("Array elements are: ");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
