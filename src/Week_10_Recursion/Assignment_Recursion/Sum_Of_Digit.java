package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static int sumOfDigit(int num) {
        if (num == 0) return 0;
        return num % 10 + sumOfDigit(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to find the sum of its digits: ");
        int num = sc.nextInt();

        int sum = sumOfDigit(num);
        System.out.println("The sum of the digits of the number " + num + " is: " + sum);
    }
}
