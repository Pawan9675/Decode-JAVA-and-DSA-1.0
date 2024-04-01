/*
PRINCIPLE: Take one element from the unsorted part, iterate through the sorted part and find the correct position of this element.

Complexity
    - Worst case time complexity: O(n^2)
    - Average case time complexity: O(n^2)
    - Best case time complexity: O(n)
    - Space complexity: O(1)

Is Insertion sort stable? YES

Is Insertion Sort an in-place algorithm? - YES (O(1)).
*/

package Week_8_Basic_Sorting.Extra_Practice;

import java.util.Scanner;

public class Insertion_Sort {
    // Method to print the elements of an array
    public static void printArray(int[] arr){
        // Loop through each element in the array
        for (int element : arr){
            // Print the current element followed by a space
            System.out.print(element + " ");
        }
        // Move to the next line after printing all elements
        System.out.println();
    }

    // Method to perform insertion sort on an array
    public static void insertionSort(int[] arr){
        // Get the length of the array
        int n = arr.length;

        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            // Initialize j to the current index i
            int j = i;
            // Move j towards the beginning of the array until it reaches 0 or arr[j] is greater than or equal to arr[j-1]
            while (j > 0 && arr[j] < arr[j-1]){
                // Swap arr[j] and arr[j-1] if arr[j] is smaller than arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the Array: ");
        // Read the size of the array from the user
        int n = sc.nextInt();
        // Create an array of size n to store the elements
        int[] arr = new int[n];
        // Ask the user to enter the elements of the array
        System.out.print("Enter the elements of Array: ");
        // Read the elements of the array from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the original array before sorting
        System.out.println("Original Array: ");
        printArray(arr);

        // Sort the array using insertion sort
        insertionSort(arr);

        // Print the sorted array after sorting
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
