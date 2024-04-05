package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Linear_Search {
    // Method to perform linear search
    public static void linearSearch(int[] arr, int target){
        // Check if the array is empty
        if (arr.length == 0){
            System.out.println("Array is empty!");
            return;
        }

        // Iterate through the array to find the target element
        for (int i = 0; i < arr.length; i++) {
            // If the target element is found, print its index and return
            if (arr[i] == target){
                System.out.println("Target "+target+" found at index: "+i);
                return;
            }
        }

        // If the target element is not found, print a message
        System.out.println("Target "+target+" not found in the array.");
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

        // Call the linearSearch method to search for the target element
        linearSearch(arr, target);
    }
}
