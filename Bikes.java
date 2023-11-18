package Level1;

class MyBike {// BluePrint: What it has ?
	String Brand;
	String Model;
	String Varient;
	String Color;
	int Price;
	long CC;

	public void Ride() {// Function: What it does ?
		System.out.println(this.Model + " Rides Smoothly ");
	}

	MyBike(String Brand, String Model, int Price) { // Parameterized Constructor
		this.Brand = Brand;
		this.Model = Model;
		this.Price = Price;

	}

	public void print() {// Printing Method
		System.out.println(this.Brand);
		System.out.println(this.Model);
		System.out.println(this.Price);
	}
}

public class Bikes {

	public static void main(String[] args) {

		// Create objects: Object Parameters should be in Main Method;
		// Calling the Method with respect to Object

		MyBike b1 = new MyBike("Honda", "Shine", 125000);
		MyBike b2 = new MyBike("Hero", "Passion XTech", 104000);
		b1.Ride();
		b1.print();
		System.out.println();
		b2.Ride();
		b2.print();

	}

}
