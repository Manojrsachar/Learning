package OneDimArray.AllArrays;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		//int len=scan.nextInt();
        int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the elements");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
			
		}

	}

}
