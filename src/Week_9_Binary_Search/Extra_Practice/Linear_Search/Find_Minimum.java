package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Find_Minimum {

    // Method to find the minimum element in an array.
    public static int findMin(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        // Initialize min to the first element of the array
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum element
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        return min;
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

        // Find the minimum element in the array
        int min = findMin(arr);

        // Print the minimum element
        System.out.println("Minimum element in the array: " + min);
    }
}
