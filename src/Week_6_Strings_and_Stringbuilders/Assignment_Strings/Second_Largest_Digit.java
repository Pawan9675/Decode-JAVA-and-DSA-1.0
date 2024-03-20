// Find the second-largest digit in the string consisting of digits from ‘0’ to ‘9’.
package Week_6_Strings_and_Stringbuilders.Assignment_Strings;

import java.util.Scanner;

public class Second_Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();

        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int digitValue = (int) str.charAt(i) - '0';
            max1 = Math.max(max1, digitValue);
        }

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int digitValue = (int) str.charAt(i) - '0';
            if (digitValue != max1) {
                max2 = Math.max(max2, digitValue);
            }
        }

        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + max2);
        } else {
            System.out.println("No second largest digit found");
        }
    }
}

