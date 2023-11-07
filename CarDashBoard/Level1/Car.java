package CarDashBoard;

public class Car {
	public void Tiago(float FuelLeft, float Mileage, float TotalDistance) {
		System.out.println();
		System.out.println("Yeah Its Connected to Tiago...");
		FuelLeft = 7.5f;
		Mileage = 20f;
		TotalDistance = 16890f;
		Print(FuelLeft, Mileage,TotalDistance);
		Action m1=new Action();
				
        System.out.println();
        
	}

	public void WagonR(float FuelLeft, float Mileage, float TotalDistance) {
		System.out.println();
		System.out.println("Yeah Its Connected to WagonR...");
		FuelLeft = 9.5f;
		Mileage = 18f;
		TotalDistance = 45890f;
		Print(FuelLeft, Mileage, TotalDistance);
		Action m2=new Action();

	}

	public float FuelRange(float FuelLeft, float Mileage) {
		float FuelRange = FuelLeft * Mileage;
		return FuelRange;

	}

	public void Print(float FuelLeft, float Mileage,float TotalDistance) {
		System.out.println("FuelLeft is " + FuelLeft + " ltrs");
		System.out.println("MileAge is " + Mileage + " kms");
		float FuelRange = FuelRange(FuelLeft, Mileage);
		System.out.println("Current Fuel Range is " + FuelRange + " kms");
		System.out.println("Total Kms Runned "+	TotalDistance);

	}

}
