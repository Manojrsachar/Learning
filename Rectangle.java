//Write a Java program to create a class called "Rectangle" with width and height attributes. 
//Calculate the area and perimeter of the rectangle.

package Level2;

import java.util.Scanner;

class Shape {
	int length;
	int width;

	public void area(int length, int width) {
		System.out.println("Area is " + (length * width));
	}

	public void perimeter(int length, int width) {
		System.out.println("Perimeter is " + 2 * (length + width));
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape s1 = new Shape();
		s1.area(4, 5);
		s1.perimeter(4, 5);

	}

}
