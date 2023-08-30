import java.util.Scanner;

public class main3{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scan.nextInt();
        int digi = countDigits(num);
        System.out.println("The Digits are: " + digi);
        if (isArmstrong(num, digi)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num =num/ 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num, int digi) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum=sum+ powerOfDigit(digit, digi);
            num =num/ 10;
        }
        return sum == originalNum;
    }

    public static int powerOfDigit(int digit, int digi) {
        int result = 1;
        for (int i = 0; i < digi; i++) {
            result=result* digit;
        }
        return result;
    }
}