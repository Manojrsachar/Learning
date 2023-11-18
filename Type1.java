package Inheritence;

class Shape {
	int area;
	int l;
	int h;

	public void area() {
		System.out.println("Area of Triangle is " + area);

	}
}

class Triangle extends Shape {
	public void area(int l, int h) {
		System.out.println(1 / 2 * (l * h));
	}
}

public class Type1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();

		t1.l = 8;
		t1.h = 9;

		t1.area(t1.l,t1.h);

	}
}