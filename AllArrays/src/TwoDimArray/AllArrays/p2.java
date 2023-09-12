package TwoDimArray.AllArrays;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st and 2nd Dimension Length");
        int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the elements");
				arr[i][j]=scan.nextInt();
			}
			
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]+" ");
				}
			System.out.println();
		}

	}

}
