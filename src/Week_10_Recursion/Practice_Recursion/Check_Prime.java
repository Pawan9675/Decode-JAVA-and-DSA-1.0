// Given a number n, check whether it's a prime number or not using recursion.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Check_Prime {

    public static boolean checkPrime(int num, int index) {
        // Base case: if num is less than 2, it's not a prime number.
        if (num < 2) return false;
        // Base case: if num is divisible by index, it's not a prime number.
        if (num % index == 0) return false;
        // If index squared is greater than num, num is a prime number.
        if (index * index > num) return true;
        // Recursive case: check the next possible divisor.
        return checkPrime(num, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();

        if (checkPrime(num, 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
