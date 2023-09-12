package TwoDimArray.AllArrays;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int arr[][]=new int[3][3];
		
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
