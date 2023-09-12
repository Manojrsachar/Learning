import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[][]=new String[5][6];
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the customer "+j+" name of bank "+i);
				 arr[i][j]=scan.next();
				
			}
		}
		System.out.println("Arrays of are ---> ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" | ");
			}System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
