// Given an array arr[] of size N-1 with integers in the range of [1, N],
// the task is to find the missing number from the first N integers. There are no duplicates in the list.
package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int m = n + 1;
        int sum1 = (m * (m + 1) / 2);
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }
        System.out.println("Missing number is: "+(sum1 - sum2));

    }
}
