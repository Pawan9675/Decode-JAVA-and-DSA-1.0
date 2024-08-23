// Print all increasing sequences of length k from first n natural numbers.

package Week_10_Recursion;

import java.util.Scanner;

public class Increasing_Sequence {
    public static void printSequences(int n, int k, int start, String seq) {
        if (k == 0) {
            System.out.println(seq);
            return;
        }

        for (int i = start; i <= n; i++) {
            printSequences(n, k - 1, i + 1, seq + i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the length of the sequences (k): ");
        int k = sc.nextInt();

        printSequences(n, k, 1, "");
    }
}
/*
import java.util.Scanner;

class Increasing_Sequence {
    // Method to print all increasing sequences of length k
    public static void printSequences(int n, int k, int start, String seq) {
        // Base case: if the sequence has reached the desired length
        if (seq.length() == k) {
            System.out.println(seq);
            return;
        }

        // Stop recursion if start exceeds n
        if (start > n) {
            return;
        }

        // Recur without including the current number
        printSequences(n, k, start + 1, seq);

        // Recur including the current number
        printSequences(n, k, start + 1, seq + start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the length of the sequences (k): ");
        int k = sc.nextInt();

        // Start generating sequences from number 1
        printSequences(n, k, 1, "");
    }
}
*/