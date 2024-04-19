package Week_10_Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Fibonacci series from 0 to "+number+" : ");
        for (int i = 0; i <= number; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
