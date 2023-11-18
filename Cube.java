package Polymorphism;

class Mycube {
	int Colors;
	String size;
	char Pattern;

	public void printInfo(int Colors) {
		System.out.println(this.Colors);

	}

	public void printInfo(String size) {
		System.out.println(this.size);

	}
	public void printInfo(char Pattern) {
		System.out.println(this.Pattern);

	}

	public void printInfo(int Colors, String size) {
		System.out.println(this.Colors);
		System.out.println(this.size);

	}

}

public class Cube {
	public static void main(String[] args) {
		Mycube c1 = new Mycube();
		c1.Colors = 6;
		c1.size = "3X3";
		c1.Pattern='A';
		
		Mycube c2 = new Mycube();
		c2.Colors = 6;
		c2.size = "5X5";
		c2.Pattern='B';

		c2.printInfo(c1.Pattern);

	}

}
