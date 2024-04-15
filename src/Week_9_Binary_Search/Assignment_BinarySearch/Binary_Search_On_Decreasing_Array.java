// Write a program to apply binary search in array sorted in decreasing order.

package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Binary_Search_On_Decreasing_Array {
    // Perform binary search
    public static int binarySearch(int[] arr, int target) {
        // Initialize start and end pointers for the search range
        int start = 0, end = arr.length - 1;
        // Continue searching as long as the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;
            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }
            // If the target is greater than the middle element, update the end pointer
            else if (arr[mid] < target) {
                end = mid - 1;
            }
            // If the target is smaller than the middle element, update the start pointer
            else {
                start = mid + 1;
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

        // Perform binary search and print the result
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}