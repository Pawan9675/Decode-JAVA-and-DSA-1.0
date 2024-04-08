/*
Best Case Time Complexity of Binary Search: O(1)
Average Case Time Complexity of Binary Search: O(logN)
Worst Case Time Complexity of Binary Search: O(logN)
Space Complexity of Binary Search: O(1) for iterative, O(logN) for recursive.
*/
package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Binary_Search {
    // Method to perform binary search iteratively on a sorted array
    public static void binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;       // Initialize start and end indices for the search

        // Perform binary search
        while (start <= end) {
            int mid = (start + end) / 2;    // Calculate the middle index
            if (target == arr[mid]) {   // If target is found at the middle index
                System.out.println(target + " found at index " + mid);
                return;                 // Exit the method if target is found
            } else if (target < arr[mid]) end = mid - 1;    // If target is smaller, search the left half
            else if (target > arr[mid]) start = mid + 1;  // If target is larger, search the right half
        }

        // If target is not found after the loop, print a message
        System.out.println(target + " not found in the array");
    }

    // Method to perform binary search recursively on a sorted array
    public static boolean binarySearchRecursively(int[] arr, int target, int start, int end){
        if (start > end) return false;  // Base case: target not found
        int mid = start + (end - start)/2;  // Calculate the middle index
        if (target == arr[mid]){  // If target is found at the middle index
            System.out.println(target + " found at index " + mid);
            return true;
        } else if (target < arr[mid]) {  // If target is smaller, search the left half
            return binarySearchRecursively(arr, target, start, mid-1);
        } else {  // If target is larger, search the right half
            return binarySearchRecursively(arr, target, mid+1, end);
        }
    }

    // Main method to get user input and call binarySearch methods
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

        // Call the binarySearch method to search for the target element iteratively
        binarySearch(arr, target);

        // Call the binarySearchRecursively method to search for the target element recursively
        if (!binarySearchRecursively(arr, target, 0, n-1)) {
            System.out.println(target + " not found in the array");
        }
    }
}
