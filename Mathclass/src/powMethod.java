import java.util.Scanner;

public class powMethod{  
    public static void main(String[] args){  
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number and exponent");
        double x =scan.nextDouble();  
        double y =scan.nextDouble();
        double z=Math.pow(x, y);
        System.out.println(x+" to the Power of "+y+" is "
        		+ "equal to "+z);  
    }  
}  