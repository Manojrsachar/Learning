
public class powerOfDigit {
	public static int powerOfDigit(int digit, int digi) {
		 int result = 1;
	        for (int i = 0; i < digi; i++) {
	            result=result* digit;
	        }
	        return result;
    }

}
