package TwoDimArray.AllArrays;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("Enter the 1st Dimension length");
		int arr[][]=new int[scan.nextInt()][];
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the 1st dimension "+i+" and 2nd Dimension Length");
	        arr[i]=new int[scan.nextInt()];
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the elements");
				arr[i][j]=scan.nextInt();
			}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]+" ");
				}
			System.out.println();
		}


	}

}
