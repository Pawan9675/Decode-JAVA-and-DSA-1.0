package Week_2_Loops.Practice;

import java.util.Scanner;

public class PrintDivisor {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Novice approach - O(n)
        for (int i = 1; i <= n ; i++) {
            if (n%i==0) System.out.print(i+" ");
        }

        // O(n^1/2)
        System.out.println();
        for (int i = 1; i*i <= n ; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
                if (i != n/i){
                    System.out.print(n/i+" ");
                }
            }
        }

        // O(n^1/2) - In ascending order
        System.out.println();
        int i = 0;
        for (i = 1; i*i <= n ; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
        for (; i>= 1; i--) {
            if (n%i==0 && i!=n/i) {
                System.out.print(n/i+" ");
            }
        }

    }
}
