// Given a number n. Print if it is an armstrong number or not.
// An armstrong number is a number if the sum of every digit in that number raised to the power of total digits in that number is equal to the number.
//Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Armstrong_Number {
    public static boolean isArmstrong(int num) {
        int numberOfDigits = (int) Math.log10(num) + 1;
        return num == armstrongRecursive(num, numberOfDigits);
    }

    public static int armstrongRecursive(int num, int numberOfDigits) {
        if (num == 0) {
            return 0;
        } else {
            int digit = num % 10;
            return (int) (Math.pow(digit, numberOfDigits) + armstrongRecursive(num / 10, numberOfDigits));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
