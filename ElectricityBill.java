import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of units of consumption");
		float unit=s1.nextFloat();
		if(unit<=200) {
			System.out.println("Idiots using Free Electricity");
		}
		else if(unit>200 && unit<=400) {
			double bill=unit*7;
			System.out.println(bill);
		}
		else if(unit>400 && unit<=800) {
			double bill=unit*9;
			System.out.println(bill);
		}
		else if(unit>800) {
			double bill=unit*7;
			System.out.println(bill);
		}

	}

}
