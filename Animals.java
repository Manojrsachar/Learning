package Abstraction;

abstract class Animal {

	abstract void Walk();
}

class Horse extends Animal {
	public void Walk() {
		System.out.println("Animal walks on 4 Legs");
	}
}

class Monkey extends Animal {
	public void Walk() {
		System.out.println("Animal walks on 2 Legs");
	}
}

public class Animals {
	public static void main(String[] args) {
		Horse h1 = new Horse();
		Monkey m1 = new Monkey();
		h1.Walk();
		m1.Walk();
	}
}
