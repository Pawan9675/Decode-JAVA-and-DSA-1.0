package Week_2_Loops.Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a1 = 0;
        int a2 = 1;
        System.out.print(a1+" ");
        System.out.print(a2+" ");

        for (int i = 2; i <= n; i++) {
            int a3 = a1 + a2;
            a1 = a2;
            a2  = a3;
            System.out.print(a3+" ");
        }
    }
}
