/*
TIME AND SPACE COMPLEXITY:
    - Worst Case Time Complexity is: O(N^2)
    - Average Case Time Complexity is: O(N^2)
    - Best Case Time Complexity is: O(N^2)
    - Space Complexity: O(1)

The number of swaps in Selection Sort are as follows:
    - Worst case: O(N)
    - Average Case: O(N)
    - Best Case: O(1)

Is Selection sort stable? NO

Is Selection Sort an in-place algorithm? - YES (O(1)).

Note: It performs well on lists/arrays.
*/

package Week_8_Basic_Sorting.Extra_Practice;

import java.util.Scanner;

public class Selection_Sort {
    // Method to print the elements of an array
    public static void printArray(int[] arr){
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to perform selection sort on an array
    public static void selectionSort(int[] arr){
        int n = arr.length;

        // Traverse through all elements except the last one
        for (int i = 0; i < n-1; i++) {
            // Assume the current index has the minimum value
            int min_index = i;

            // Find the minimum element in the unsorted part of the array
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            // Swap the current element with the minimum element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    // Main method to input the array and demonstrate selection sort
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

        // Perform selection sort
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
