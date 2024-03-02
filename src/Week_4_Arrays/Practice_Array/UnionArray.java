//Given two arrays a[] and b[] of size n and m respectively where m >= n.
// The task is to find union between these two arrays and print the number of elements of the union set.
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
// If there are repetitions, then only one occurrence of element should be printed in the union.

package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array A: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " elements Array A: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the Array B: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter " + m + " elements Array B: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] union = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                if (union[j] == a[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) union[k++] = a[i];
        }

        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                if (union[j] == b[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) union[k++] = b[i];
        }

        System.out.println("Union of Array A and B: ");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }

        System.out.println("\nSize of union set is: " + k);

    }
}