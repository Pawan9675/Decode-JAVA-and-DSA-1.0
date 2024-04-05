package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Search_In_Range {

     // Method to perform linear search within a specified range of indices.
    public static void linearSearchInRange(int[] arr, int target, int start, int end) {
        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        // Validate the range indices
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid range!");
            return;
        }

        // Iterate through the specified range to find the target element
        for (int i = start; i <= end; i++) {
            // If the target element is found, print its index and return
            if (arr[i] == target) {
                System.out.println("Target " + target + " found at index: " + i);
                return;
            }
        }

        // If the target element is not found in the specified range, print a message
        System.out.println("Target " + target + " not found in the specified range.");
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

        // Prompt user to enter the start and end indices of the range
        System.out.print("Enter the start index of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index of the range: ");
        int end = sc.nextInt();

        // Call the linearSearchInRange method to search for the target element within the specified range
        linearSearchInRange(arr, target, start, end);
    }
}
