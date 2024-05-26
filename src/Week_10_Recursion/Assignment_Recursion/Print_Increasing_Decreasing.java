package Week_10_Recursion.Assignment_Recursion;

import java.util.Scanner;

public class Print_Increasing_Decreasing {
    public static void printIncDec(int num, int i) {
        if (i > num) return;

        System.out.print(i + " ");
        printIncDec(num, i + 1);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Printing numbers in increasing and then decreasing order:");
        printIncDec(num, 1);
    }
}
