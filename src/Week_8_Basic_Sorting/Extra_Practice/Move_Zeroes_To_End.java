// Given an integer array arr, move all O's to the end of it while maintaining the relative order of the non-zero elements.
// Note that vou must do this in-place without making a conv of the array.

package Week_8_Basic_Sorting.Extra_Practice;

import java.util.Scanner;

public class Move_Zeroes_To_End {
    // Function to move all zeros to the end of the array while maintaining the relative order of non-zero elements
    public static void zeroesToEnd(int[] arr){
        int n = arr.length;

        // Using bubble sort logic to move zeros to the end
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // If current element is 0 and next element is non-zero, swap them
                if (arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr){
        for (int element : arr){
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

        zeroesToEnd(arr);

        System.out.println("Array after moving zeros to end: ");
        printArray(arr);
    }
}
