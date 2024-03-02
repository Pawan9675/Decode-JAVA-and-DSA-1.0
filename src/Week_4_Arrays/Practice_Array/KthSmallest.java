// Given an array arr[] and an integer K where K is smaller than size of array,
// the task is to find the Kth smallest element in the given array.
// It is given that all array elements are distinct.

package Week_4_Arrays.Practice_Array;

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