// Given a sorted integer array and an integer 'x', find the upper bound of x.

package Week_9_Binary_Search;

import java.util.Scanner;

public class Upper_Bound {
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

        // Get the target element from the user
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // Initialize the upper bound to be the size of the array
        int upperBound = n;
        // Initialize the start and end pointers for binary search
        int start = 0, end = n - 1;
        // Perform binary search to find the upper bound of the target element
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // If the middle element is greater than or equal to the target
            if (arr[mid] > target) {
                // Update the upper bound and move the end pointer to search the left sub-array
                upperBound = Math.min(upperBound, mid);
                end = mid - 1;
            } else {
                // Move the start pointer to search the right sub-array
                start = mid + 1;
            }
        }

        // Output the upper bound of the target element
        System.out.println("upper bound of " + target + " is at index: " + upperBound);
    }
}
