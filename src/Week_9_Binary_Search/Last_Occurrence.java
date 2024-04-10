package Week_9_Binary_Search;

import java.util.Scanner;

public class Last_Occurrence {
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

        int start = 0, end = n - 1;
        int lastPos = -1; // Initialize variable to store the index of the last occurrence

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                // If target is found, check if it's the last occurrence
                if (mid + 1 < n && arr[mid] == arr[mid + 1]) // If it's not the last occurrence
                    start = mid + 1; // Adjust start pointer to search in the right half
                else {
                    // If it's the last occurrence, store its index and exit the loop
                    lastPos = mid;
                    break;
                }
            } else if (target < arr[mid]) // If target is less than the middle element
                end = mid - 1; // Adjust end pointer to search in the left half
            else // If target is greater than the middle element
                start = mid + 1; // Adjust start pointer to search in the right half
        }

        // Check if target is found or not and print the result accordingly
        if (lastPos == -1)
            System.out.println(target + " not found in the array");
        else
            System.out.println("Last occurrence of " + target + " is at index " + lastPos);
    }
}
