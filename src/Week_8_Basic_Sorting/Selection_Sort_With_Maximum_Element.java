// Sort a given Array in increasing order using selection sort, but in each pass,
// put the kth maximum element at the right position.
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Selection_Sort_With_Maximum_Element {
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

        for (int i = n-1; i > 0; i--) {
            int maxValue = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > maxValue){
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
