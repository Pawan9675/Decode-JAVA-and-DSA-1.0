// Given an array arr[] of size n, find the first repeating element. The element should occur more than
// once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
// (Assume 1 based indexing)
package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Using 1-based indexing
        System.out.print("Enter the elements of Array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First Repeating index: " + i);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating numbers found. "+-1);
        }
    }
}
