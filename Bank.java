package Inheritence;

class Account {// What it has

	public String name; // Access by all
	protected String Email; // Access within a package
	private String Password; // Access indirectly

	// Getter and setter Method
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String pass) {
		this.Password = pass;
	}

	public void print() { // what it does
		System.out.println(this.name);
		System.out.println(this.Email);
		System.out.println("Aste saku bidoo");
	}
}

public class Bank {
	public static void main(String[] args) { // Object creation and calling
		Account a1 = new Account();
		a1.name = "Manoj";
		a1.Email = "manojrs@gmail.com";
		a1.setPassword("qwerty");
		System.out.println(a1.getPassword());
		a1.print();

	}

}
