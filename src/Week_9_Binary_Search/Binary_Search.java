/*

- It is used to search a given element in a sorted space (array).
- It is used to reduce the search space on half after every turn.

Usually, we apply binary search when it is given that 'It is sorted array'.
Binary search is very efficient than Linear search (T.C. O(n)) because we don't need to traverse the whole array when it is sorted

--> Best Case Time Complexity of Binary Search: O(1)
--> Average Case Time Complexity of Binary Search: O(logN)
--> Worst Case Time Complexity of Binary Search: O(logN)
--> Space Complexity of Binary Search: O(1) for iterative, O(logN) for recursive.

*/
package Week_9_Binary_Search;

import java.util.Scanner;

public class Binary_Search {

    // Check if the array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Perform binary search
    public static int binarySearch(int[] arr, int target) {
        // Initialize start and end pointers for the search range
        int start = 0, end = arr.length - 1;
        // Continue searching as long as the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;        // OR (start + end) / 2
            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }
            // If the target is greater than the middle element, update the start pointer
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // If the target is smaller than the middle element, update the end pointer
            else {
                end = mid - 1;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

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

        // Check if the array is sorted
        if (!isSorted(arr)) {
            System.out.println("Array must be sorted for binary search to work.");
            return;
        }

        // Perform binary search and print the result
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
