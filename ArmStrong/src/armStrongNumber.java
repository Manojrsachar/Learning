
public class armStrongNumber {
	public static boolean armStrongNumber(int num, int digi) {
		int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum=sum+ powerOfDigit.powerOfDigit(digit, digi);
            num =num/ 10;
        }
        return sum == originalNum;
 }

 
	}		



