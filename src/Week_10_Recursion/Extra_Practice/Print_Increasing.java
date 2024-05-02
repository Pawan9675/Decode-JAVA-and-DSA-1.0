// Write a program to print all natural numbers from I to n using recursion.
package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Print_Increasing {
    public static void printIncreasing (int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Numbers in Increasing order from 1 to " + num + ": ");
        printIncreasing(num);
    }
}
