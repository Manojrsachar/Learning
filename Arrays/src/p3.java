import java.util.Scanner;

public class p3 {


		public  static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String arr[]=new String[8];			
		
			for(int i=0;i<=arr.length-1;i++){
				System.out.println("Enter the Employee "+(i=i+1)+"  name");
				 arr[i]=scan.next();
			}			
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println("Employee "+(i=i+1)+" name is "+arr[i]+" ");
			}	
	}
}
