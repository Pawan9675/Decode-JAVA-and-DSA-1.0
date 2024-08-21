// Given a number n, check whether it's a prime number or not using recursion.
package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Check_Prime {
    public static boolean checkPrime(int num, int index) {
        if (num <= 2) return num == 2;
        if (num % index == 0) return false;
        if (index * index > num) return true;
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
