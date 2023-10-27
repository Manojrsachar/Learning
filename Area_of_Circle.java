import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
		System.out.println("Enter the radius of circle");
		int r=s1.nextInt();
		double area=3.142*(r*r);
		System.out.println(area);
		}
		
	}

}
