package Level1;

class Bike {// BluePrint: What it has
	String Brand;
	String Model;
	String Varient;
	String Color;
	int Price;
	long CC;

	public void Ride() {// Function: What it does
		System.out.println("Rides Smoothly");
	}

	Bike() { // Non Parameterized Constructor
		System.out.println("Start");
	}

	public void print() {
		System.out.println(this.Brand + " " + this.Model);
		System.out.println(this.Color + " " + this.Varient);
		System.out.println(this.CC);
		System.out.println(this.Price);
	}
}

public class Oops {

	public static void main(String[] args) {
		// Create objects: Object Parameters should be in Main Method;
		// Calling the Method with respect to Object
		Bike b1 = new Bike();
		b1.Brand = "Honda";
		b1.Model = "Activa";
		b1.Varient = "Alpha";
		b1.Color = "White";
		b1.Price = 115000;
		b1.CC = 125;

		Bike b2 = new Bike();
		b2.Brand = "Honda";
		b2.Model = "Shine";
		b2.Varient = "Alpha";
		b2.Color = "Red";
		b2.Price = 125000;
		b2.CC = 125;

		b1.print();

	}

}
