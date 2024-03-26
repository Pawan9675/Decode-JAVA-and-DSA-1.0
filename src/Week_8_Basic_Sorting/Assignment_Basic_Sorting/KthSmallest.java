// Given an integer array and an integer k where k<=size of array,
// We need to return the kth smallest element of the array.

package Week_8_Basic_Sorting.Assignment_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(k + "st/nd/th/rd smallest in the given array is: " + arr[k - 1]);
    }
}