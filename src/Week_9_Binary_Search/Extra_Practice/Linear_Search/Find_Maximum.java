package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Find_Maximum {

    // Method to find the maximum element in an array.
    public static int findMax(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        // Initialize max to the first element of the array
        int max = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum element
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        return max;
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

        // Find the maximum element in the array
        int max = findMax(arr);

        // Print the maximum element
        System.out.println("Maximum element in the array: " + max);
    }
}
