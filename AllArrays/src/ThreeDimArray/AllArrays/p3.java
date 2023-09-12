package ThreeDimArray.AllArrays;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st  Dimension Length");
        int arr[][][]=new int[scan.nextInt()][][];
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
        for(int i=0;i<=arr.length-1;i++) {
				System.out.println("Enter the 2nd Dimension length");
				arr[i]=new int[scan.nextInt()][];
			}
        for(int i=0;i<=arr.length-1;i++) {
        	for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the 3rd Dimension length");
			arr[i][j]=new int[scan.nextInt()];
		}
        } 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("Enter the elements");
				arr[i][j][k]=scan.nextInt();
				System.out.println();
			}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.print(arr[i][j][k]+" ");
				}
			System.out.println();
		}System.out.println();
		}


	}

}
