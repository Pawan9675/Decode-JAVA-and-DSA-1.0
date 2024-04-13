// Given a sorted binary array, efficiently count the total number of 1’s in it.
package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Count_1s_In_Binary_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the size of the array from the user
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Get the elements of the array from the user (assuming the array is sorted)
        System.out.print("Enter the elements of Array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = n - 1;
        int firstPos = -1; // Initialize variable to store the index of the last occurrence

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (1 == arr[mid]) {
                firstPos = mid; // Store the current index as the potential last occurrence
                end = mid - 1; // Adjust end pointer to search in the left half
            } else if (1 < arr[mid]) {
                end = mid - 1; // Adjust end pointer to search in the left half
            } else {
                start = mid + 1; // Adjust start pointer to search in the right half
            }
        }

        // Calculate and print the number of 1's in the binary array
        System.out.println("Numbers of 1's in given binary array: " + ((n - 1) - firstPos + 1));
    }
}
