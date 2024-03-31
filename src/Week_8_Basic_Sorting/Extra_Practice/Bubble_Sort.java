/*
EXPLANATION:
-> We do a certain number of passes(n-1) and in every pass,
   we compare adjacent elements and swap them if they are not in correct order.
-> In every iteration, the largest number in part of array to be processed gets its correct position.

TIME COMPLEXITY:
-> Worst Case
    - O(N^2)
    - Number of Comparisons: O(N^2) time
    - Number of swaps: O(N^2) time

-> Average Case
    - Θ(N^2)
    - Number of Comparisons: O(N^2) time
    - Number of swaps: O(N^2) time

-> Best Case
    - O(N)
    - Number of Comparisons: N = O(N) time
    - Number of swaps: 0 = O(1) time

SPACE COMPLEXITY - O(1).

Maximum no of swaps in worst case in Bubble Sort - n(n-1)/2.

Is Bubble sort stable? - YES.

Is Bubble Sort an in-place algorithm? - YES (O(1)).

Bubble sort is also known as Sinking sort or Exchange sort.

*/
package Week_8_Basic_Sorting.Extra_Practice;

import java.util.Scanner;

public class Bubble_Sort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // (n-1) Iteration/Passes
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false; // Flag to track if any elements were swapped
            // The last i elements are already at their correct positions, so no need to check them
            for (int j = 0; j < n-i-1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true; // Set the flag to true since a swap occurred
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                return;
            }
        }
    }


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

        bubbleSort(arr);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
