// Given an array with N distinct elements, convert the given array to a form where all elements are in the range
// from 0 to N-1. The order of elements is the same, i.e., 0 is placed in the place of the smallest element, 1 is placed for
//the second-smallest element, ... N-1 is placed for the largest element.

package Week_8_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Transform_Array_Approach_1 {
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        int[] brr = new int[arr.length];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = arr[i];
        }
        Arrays.sort(brr);

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (brr[i] == arr[j]){
                    arr[j] = i;
                    break;
                }
            }
        }

        System.out.println("Transformed Array: ");
        printArray(arr);
    }
}
