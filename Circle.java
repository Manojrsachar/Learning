//Write a Java program to create a class called "Circle" with a radius attribute.
//You can access and modify 
//this attribute. Calculate the area and circumference of the circle.

package Level2;

import java.util.Scanner;

class Calculate {
	int radius;

	public void area(int radius) {
		System.out.println("Area is " + (3.142 * (radius * radius)));
	}

	public void Circumferance(int radius) {
		System.out.println("Circumferance is " + 2 * (3.142 * radius));
	}
}

public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculate c1 = new Calculate();
		c1.area(4);
		c1.Circumferance(4);

	}

}
