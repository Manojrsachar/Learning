package Level1;

class Car {
	String brand;
	String model;
	int price;

	public void Printing() {
		System.out.println("Welcome to "+this.brand);
		System.out.println("Here are Some of the Listed cars.....");
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);

	}
}

public class Cars {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();

		c1.brand = "Tata";
		c1.model = "Tiago";
		c1.price = 700000;

		c2.brand = "Maruthi Suzuki";
		c2.model = "Wagon-R";
		c2.price = 400000;

		c2.Printing();

	}

}
