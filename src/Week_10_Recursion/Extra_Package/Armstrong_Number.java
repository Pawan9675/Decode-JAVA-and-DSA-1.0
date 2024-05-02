package Week_10_Recursion.Extra_Package;

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
