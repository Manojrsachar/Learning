import java.util.Scanner;

public class M1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Fuel level points of Car : ");
		int fuelPoints = scan.nextInt();
		if (fuelPoints <= 7) {
			System.out.print("Enter the Mileage of Car : ");
			float mileage = scan.nextFloat();
			float fuelLevel = (fuelPoints * 5) - 5;
			float milerange = (fuelLevel * mileage);
			System.out.println("Fuel Level in Points is " + fuelLevel + " ltrs");
			System.out.println("MileRange for " + fuelLevel + " ltrs is " + milerange + " kms");
			System.out.println("Do you want to travel now..!");
			char ch = scan.next().charAt(0);
			if (ch == 'Y' || ch == 'y') {
				System.out.println("How much Distance you want to Travel ?");
				int dist = scan.nextInt();
				if (dist >= milerange) {
					float extDist = dist - milerange;
					System.out.println("You need extra fuel for " + extDist + " kms");

					System.out.println("In way u want to add Fuel..");
					System.out.println("1. Distance Travel");
					System.out.println("2. Fuel in ltrs");
					System.out.println("3. Amount in INR");
					float distTravel1 = 1;
					double cost = 1;
					int num = scan.nextInt();
					switch (num) {
					case 1:
						distTravel1 = extDist / mileage;
						System.out.println("You need " + distTravel1 + " lts to travel " + dist + " kms");
						cost = 101.3 * distTravel1;
						System.out.println("For that you need " + cost + " INR");
						break;

					case 2:
						System.out.println("You need " + distTravel1 + " lts to travel " + dist + " kms");
						System.out.println("For that you need " + cost + " INR");
						break;

					case 3:
						System.out.println("For that you need " + cost + " INR");
						break;

					}

				} else {
					System.out.println("Fuel is Enough");
				}
				if (ch == 'N' || ch == 'n') {
					System.out.println("Thank You");
				}
			}

		} else {
			System.out.println("Bye");
		}

	}
}
