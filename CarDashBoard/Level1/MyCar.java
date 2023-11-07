package CarDashBoard;

import java.util.Scanner;

public class MyCar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float FuelLeft = 0;
		float Mileage = 0;
		float TotalDistance=0;
		
		

		Car c1 = new Car();
		Car c2 = new Car();

		System.out.println("Welcome to RS Car Garage");
		for (int i = 1; i <= 100; i++) {
			System.out.print("Choose Your Car to get info of it... !! [Tiago=1/WagonR=2]: ");
			int ch = scan.nextInt();
			if (ch == 1) {
				c1.Tiago(FuelLeft, Mileage,TotalDistance);

			} else if (ch == 2) {
				c2.WagonR(FuelLeft, Mileage,TotalDistance);
			}
			
		}

	}

}
