package OneDimArray.AllArrays;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
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
