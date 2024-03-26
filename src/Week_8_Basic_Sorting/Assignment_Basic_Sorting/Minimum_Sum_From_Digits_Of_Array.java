// Given an array of digits (values are from 0 to 9), the task is to find the minimum possible sum of two numbers formed from digits of the array.
// Please note that all digits of the given array must be used to form the two numbers.
package Week_8_Basic_Sorting.Assignment_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Sum_From_Digits_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sort the array
        Arrays.sort(arr);

        // let two numbers be a and b
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {

            // fill a and b with every alternate
            // digit of input array
            if (i % 2 != 0)
                a = a * 10 + arr[i];
            else
                b = b * 10 + arr[i];
        }

        // return the sum
        System.out.println("Minimum sum of two numbers formed from digits of an array: " + (a + b));
    }
}
