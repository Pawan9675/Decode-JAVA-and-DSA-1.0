package Week_10_Recursion.Extra_Package;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        if (n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int number = sc.nextInt();

        System.out.println("Fibonacci series of "+number+" numbers: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
