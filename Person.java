//Write a Java program to create a class called "Person" with a name and age
//attribute. Create two instances of the "Person" class, set their attributes 
//using the constructor, and print their name and age.

package Level2;

class personinfo{
	private String name;
	private int age;

	public void getName() {
		System.out.println(this.name);

	}

	public void setName(String name) {
		this.name = name;
	}

	public void getAge() {
		System.out.println(this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Person {

	public static void main(String[] args) {
		personinfo p1 = new personinfo();
		p1.setName("Manu");
		p1.setAge(22);
		p1.getName();
		p1.getAge();

	}

}
