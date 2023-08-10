package StringJoiner;
public class Stringapp {

	public static void main(String[] args) {
		String str1="Hello, ";
		String str2="World!";
		System.out.println(joinStrings(str1,str2));
		
		

	}
	public static String joinStrings(String str1,String str2) {
		return (str1 + str2);
	}

}
