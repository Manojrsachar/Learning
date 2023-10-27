import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		//Area=0.5*b*h;
		
		Scanner s1=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
		System.out.println("Enter the breadth of triangle");
		int b=s1.nextInt();
		System.out.println("Enter the height of triangle");
		int h=s1.nextInt();
		double Area=0.5*(b*h);
		System.out.println(Area);
		}
		

	}

}
