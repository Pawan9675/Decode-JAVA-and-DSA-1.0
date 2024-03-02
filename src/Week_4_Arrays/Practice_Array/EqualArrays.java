// Write a java program to test the equality of two arrays.

package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class EqualArrays {
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

        /*boolean result = Arrays.equals(a, b);
        if (result) System.out.println("Two arrays are equal");
        else System.out.println("Two arrays are not equal");*/

        boolean flag = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    flag = false;
                    break;
                }
            }
        } else flag = false;

        if (flag) System.out.println("Two arrays are equal");
        else System.out.println("Two arrays are not equal");
    }
}
