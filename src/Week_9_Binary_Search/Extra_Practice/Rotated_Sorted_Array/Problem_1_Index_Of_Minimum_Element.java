// A rotated sorted array is a sorted array on which rotation operation has been performed some number of times.
// Given a rotated sorted array, find the index of the minimum element in the array. Follow 0-based indexing.
// It is guaranteed that all the elements in the array are unique.
// OR Find the index of pivot.

/*
Let's take an example:

            1st Sorted Array   2nd Sorted Array
                  |                   |
        ----------------------  --------------
        5   6   7   8   9   10  1   2   3   4
        |                                   |
      start                                end

    Observations:
    1. All elements in 1st sorted array or before the pivot are bigger than the last element. i.e. > arr[n-1].
    2. All elements in 2nd sorted array or after the pivot are smaller/equal to the last element. i.e. <= arr[n-1].
    3. Minimum element is the first element of 2nd sorted array.
*/

package Week_9_Binary_Search.Extra_Practice.Rotated_Sorted_Array;

import java.util.Scanner;

public class Problem_1_Index_Of_Minimum_Element {

    // Function to find the index of the minimum element in a rotated sorted array
    public static int findMinimum(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1; // Initialize the answer to -1

        // Binary search to find the minimum element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= arr[n-1]) {
                // If current element is less than or equal to the last element, update answer and search in the left half
                ans = mid;
                end = mid - 1;
            } else {
                // If current element is greater than the last element, search in the right half
                start = mid + 1;
            }
        }
        return ans; // Return the index of the minimum element
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

        // Find and print the index of the minimum element
        System.out.println("The index of minimum element in the given Rotated sorted array is " + findMinimum(arr));
    }
}
