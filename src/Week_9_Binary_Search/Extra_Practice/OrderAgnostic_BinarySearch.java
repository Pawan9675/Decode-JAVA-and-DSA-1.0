package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the length of the array
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        // Input the target element to search for
        System.out.print("Enter the target element to search for: ");
        int target = sc.nextInt();

        // Perform binary search and print the index of the target element
        int index = orderAgnosticBinarySearch(array, target);
        if (index != -1) {
            System.out.println("Index of the target element: " + index);
        } else {
            System.out.println("Target element not found in the array.");
        }
    }

    // Perform binary search on the array
    static int orderAgnosticBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid; // Return the index of the target element
            }

            // Check if the array is sorted in ascending order
            if (isAscending) {
                // If the array is sorted in ascending order
                // If the target is less than the middle element, search in the left half
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    // If the target is greater than or equal to the middle element, search in the right half
                    start = mid + 1;
                }
            } else {
                // If the array is sorted in descending order
                // If the target is greater than the middle element, search in the left half
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    // If the target is less than or equal to the middle element, search in the right half
                    start = mid + 1;
                }
            }

        }

        return -1; // Return -1 if the target element is not found
    }
}
