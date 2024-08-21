// Given a number n, print the following pattern without using any loop.
// n, n-5, n-10, …, 0, 5, 10, …, n-5, n

package Week_10_Recursion.Practice_Recursion;

import java.util.Scanner;

public class Pattern_Of_5 {
    public static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        System.out.println("Generated Pattern:");
        pattern(num);
    }
}
