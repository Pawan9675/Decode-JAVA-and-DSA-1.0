// Return the count of digits in a given number n.

package Week_10_Recursion.Extra_Package;

import java.util.Scanner;

public class Count_Of_Digit {
    public static int countOfDigit(int n) {
        if (n >= 0 && n <= 9) return 1;
        return countOfDigit(n / 10) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits in the number " + num + " is: " + countOfDigit(num));

    }
}
