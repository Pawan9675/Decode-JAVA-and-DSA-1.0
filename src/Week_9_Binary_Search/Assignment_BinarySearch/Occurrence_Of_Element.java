// You are given a sorted array containing N integers and a number target,
// you have to find the number of occurrences of the target in the given array
package Week_9_Binary_Search.Assignment_BinarySearch;

import java.util.Scanner;

public class Occurrence_Of_Element {
    // Method to find the first occurrence of a target element in a sorted array
    public static int firstOccurrence(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int first = -1; // Initialize first occurrence index to -1
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                first = mid; // Update first occurrence index
                end = mid - 1; // Continue searching in the left sub-array for earlier occurrences
            } else if (target > arr[mid])
                start = mid + 1; // Continue searching in the right sub-array
            else
                end = mid - 1; // Continue searching in the left sub-array
        }
        return first; // Return the index of the first occurrence of the target element
    }
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

        // Call the firstOccurrence method to search for the target element iteratively
        int firstIndex = firstOccurrence(arr, target);

        // Call the lastOccurrence method to search for the target element iteratively
        int lastIndex = lastOccurrence(arr, target);

        // Calculate the number of occurrences
        int occurrences = lastIndex - firstIndex + 1;

        // Display the result
        if (firstIndex == -1)
            System.out.println(target + " not found in the array");
        else
            System.out.println("Number of occurrences of " + target + " is " + occurrences);
    }
}
