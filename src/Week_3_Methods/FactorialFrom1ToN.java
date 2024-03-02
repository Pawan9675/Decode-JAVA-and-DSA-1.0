package Week_3_Methods;

import java.util.Scanner;

public class FactorialFrom1ToN {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Factorial of "+i+" : "+ factorial(i));
        }
        
        // Without using function
        System.out.println();
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
            System.out.println("Factorial of "+i+" : "+fact);
        }
    }
}
