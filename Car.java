import java.util.Scanner;

public class Car {
	static Scanner scan=new Scanner(System.in);
	public static void Tiago(float FuelLeft, float Mileage,float MileRange) {
		System.out.println("Yeah Its Connected to Tiago...");
		FuelLeft = 7.5f;
		Mileage = 20f;
		System.out.println("FuelLeft is "+FuelLeft+" ltrs");
		System.out.println("MileAge is "+ Mileage+" kms");
		float CurrentMileRange1 = MileRange(FuelLeft, Mileage);
		System.out.println("CurrentMileRange is " + CurrentMileRange1+" kms");
		Action(CurrentMileRange1, Mileage, MileRange);
		System.out.println("New Range is " + MileRange);

	}
	
	public static void WagonR(float FuelLeft, float Mileage,float MileRange) {
		System.out.println("Yeah Its Connected to WagonR...");
		FuelLeft = 9.6f;
		Mileage = 18f;
		System.out.println("FuelLeft is "+FuelLeft);
		System.out.println("MileAge is "+ Mileage);
		float CurrentMileRange1 = MileRange(FuelLeft, Mileage);
		System.out.println("CurrentMileRange" + CurrentMileRange1);
		Action(CurrentMileRange1, Mileage, MileRange);
		System.out.println("New Range is " + MileRange);

	}
	
	public static float MileRange(float FuelLeft, float Mileage) {
		float CurrentMileRange = (FuelLeft * Mileage);
		return CurrentMileRange;

	}
	
	public static void Action(float CurrentMileRange1,float Mileage,float MileRange ) {
		System.out.println("Do you want to add Fuel....[Y==1/N==2]");
		int ch = scan.nextInt();
		if (ch == 1) {
			FuelAdd(CurrentMileRange1, Mileage, MileRange ); 


		} else {
			System.out.println("Thank You");
		}

	}
	
	public static void FuelAdd(float CurrentMileRange1,float Mileage,float MileRange ) {
		System.out.println("Do u want to add Fuel in perspective Distance  or Amount..??  [D=1/A=2]");
		int ch = scan.nextInt();
		if (ch == 1) {
			FuelDist(CurrentMileRange1, MileRange, Mileage);

		}

	}
	
	public static float FuelDist(float CurrentMileRange1, float MileRange,float Mileage) {
		System.out.println("Your current MileRange is " + CurrentMileRange1);
		System.out.println("How much Distance you want to travel...");
		float dis = scan.nextFloat();
		if (dis > CurrentMileRange1) {
			float dist = dis - CurrentMileRange1;
			System.out.println("You want additional Fuel of " + dist + " kms");
			float MileRange1 = dist / Mileage;
			MileRange = MileRange1;
			System.out.println(MileRange);
			return MileRange;
		} else {
			System.out.println("Fuel is Sufficeint");
		}

		return 0;

	}

}
