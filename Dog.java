//Write a Java program to create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class, set their attributes using the 
//constructor and modify the attributes using the setter methods and print 
//the updated values.

package Level2;

import java.util.Scanner;

class MyDog {
	private String name;
	private String breed;

	public MyDog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class Dog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyDog d1 = new MyDog("Zuzu", "Pug");
		MyDog d2 = new MyDog("Charli", "Labrador");

		System.out.println(d1.getName() + " is a " + d1.getBreed() + " Dog.");
		System.out.println(d2.getName() + " is a " + d2.getBreed() + " Dog.");

		System.out.println("Do u want to Rename the Dog");
		char ch = scan.next().charAt(0);
		char sh = scan.next().charAt(0);

		if (ch == 'Y' && sh == '1') {
			System.out.println("Enter the new Name");
			d1.setName(scan.next());
			System.out.println("Enter the new Breed");

			d1.setBreed(scan.next());
		} else if (ch == 'Y' && sh == '2') {
			System.out.println("Enter the new Name");
			d2.setName(scan.next());
			System.out.println("Enter the new Breed");
			d2.setBreed(scan.next());
		} else {
			System.out.println("The Information is not changed");
		}

		System.out.println(d1.getName() + " is a " + d1.getBreed() + " Dog.");
		System.out.println(d2.getName() + " is a " + d2.getBreed() + " Dog.");

	}

}
