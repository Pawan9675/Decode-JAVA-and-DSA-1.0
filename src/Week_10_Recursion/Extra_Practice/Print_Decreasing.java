package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Print_Decreasing {
    public static void printDecreasing (int n){
        if (n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Numbers in Decreasing order from " + num + " to 1: ");
        printDecreasing(num);
    }
}
