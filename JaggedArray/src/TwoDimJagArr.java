import java.util.Scanner;

public class TwoDimJagArr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
///////////////////////////////////1D Array initialization//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Enter the 1D Array Length");
		int arr[][]=new int[scan.nextInt()][];
		
//////////////////////////////////2D Array initialization//////////////////////////////////////////////////////////////////////////////////////
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the 2D Array Length");
			arr[i]=new int[scan.nextInt()];
		}
/////////////////////////////// Entering the elements in an Array/////////////////////////////////////////////////////////////////////////////////////
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.println("Enter the elements");
				arr[i][j]=scan.nextInt();
			}			
		}
		
/////////////////////////////////////////Printing//////////////////////////////////////////////////////////////////////////////////////
	
		System.out.println("************************************************************");
		System.out.println();
		System.out.println("Array Contents are....");
		System.out.println();
		   for(int i=0;i<=arr.length-1;i++)
		     {
		      for(int j=0;j<=arr[i].length-1;j++)
		       {
		    	  System.out.print(arr[i][j]+" | ");
		       }
		      System.out.println();
		     }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}