// Find the last occurrence of a given element x, given that the given array is sorted.
// If no occurrence of x is found then return -1.
package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Last_Occurrence {
    // Method to find the last occurrence of a target element in a sorted array
    public static int lastOccurrence(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int last = -1; // Initialize last occurrence index to -1
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                last = mid; // Update last occurrence index
                start = mid + 1; // Continue searching in the right sub-array for later occurrences
            } else if (target > arr[mid])
                start = mid + 1; // Continue searching in the right sub-array
            else
                end = mid - 1; // Continue searching in the left sub-array
        }
        return last; // Return the index of the last occurrence of the target element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Prompt user to enter the elements of the array
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prompt user to enter the target element to search
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Call the lastOccurrence method to search for the target element iteratively
        int last = lastOccurrence(arr, target);

        // Display the result
        System.out.println("The last occurrence of " + target + " is at index: " + last);
    }
}
