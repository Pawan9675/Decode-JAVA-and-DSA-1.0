// Given a number num and a value k. Print k multiples of num.
package Week_10_Recursion.Extra_Package;

import java.util.Scanner;

public class Multiples {
    public static void printMultiples(int num, int k) {
        if (k == 0) return;
        printMultiples(num, k - 1);
        System.out.println(num + " x " + k + " = " + (num * k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("First " + k + " multiples of " + num + " are: ");
        printMultiples(num, k);
    }
}
