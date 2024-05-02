package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Multiplication {
    public static int multiply (int a, int b){
        if (b == 0) return 0;
        return a + multiply(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println(multiply(a,b));
    }
}
