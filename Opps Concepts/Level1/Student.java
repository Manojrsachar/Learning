package Level1;

class Data {
	String Name;
	String Degree;
	String Stream;
	int Passout;
	float CGPA;

	public void printData() {
		System.out.println("Welcome " + this.Name + " :");
		System.out.println(this.Name);
		System.out.println(this.Degree);
		System.out.println(this.Stream);
		System.out.println(this.Passout);
		System.out.println(this.CGPA);

	}
	Data(){
		System.out.println("HEllo");
		
	}
}

public class Student {

	public static void main(String[] args) {
		Data s1 = new Data();
		Data s2 = new Data();

		s1.Name = "Manoj RS";
		s1.Degree = "Engineering";
		s1.Stream = "ECE";
		s1.Passout = 2023;
		s1.CGPA = 7.5f;
		
		s2.Name = "Shivakumar As";
		s2.Degree = "Engineering";
		s2.Stream = "ME";
		s2.Passout = 2023;
		s2.CGPA = 8.5f;

		s1.printData();
		System.out.println();
		s2.printData();

	}

}
