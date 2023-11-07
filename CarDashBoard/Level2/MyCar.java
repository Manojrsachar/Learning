
import java.util.Scanner;

public class MyCar {
	static Scanner scan = new Scanner(System.in);
	static float FuelLeft;
	static float FuelAdd;
	static float Mileage;
	static float MileRange;
	static float CurrentMileRange;

	public static void main(String[] args) {

		Car Tiago = new Car();
		Car WagonR = new Car();

		System.out.println("Welcome to RS Car Garage");
		System.out.print("Choose Your Car to get info of it... !! [Tiago=1/WagonR=2]: ");
		int ch = scan.nextInt();
		if (ch == 1) {
			Tiago.Tiago(FuelLeft, Mileage, MileRange);

		} else if (ch == 2) {
			WagonR.WagonR(FuelLeft, Mileage, MileRange);
		}

	}

}
