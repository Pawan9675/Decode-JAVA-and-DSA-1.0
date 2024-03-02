package Week_1_Basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double b = sc.nextDouble();
        System.out.printf("Square of %.2f is: %.2f ",a,(a*a));
        System.out.println();
        System.out.printf("Square of %.2f is: %.2f ",b,(b*b));
        System.out.println();
        System.out.printf("Sum of %.2f and %.2f is: %.2f",a,b,(a+b));
    }
}
