package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class Linear_Search_2D {
    // Method to perform linear search in a 2D array
    public static void linearSearch2D(int[][] arr, int target) {
        // Check if the array is empty
        if (arr.length == 0 || arr[0].length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        // Iterate through the 2D array to find the target element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // If the target element is found, print its indices and return
                if (arr[i][j] == target) {
                    System.out.println("Target " + target + " found at row: " + i + ", column: " + j);
                    return;
                }
            }
        }

        // If the target element is not found, print a message
        System.out.println("Target " + target + " not found in the 2D array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of rows and columns of the 2D array
        System.out.print("Enter the number of rows in the 2D array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        // Prompt user to enter the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Prompt user to enter the target element to search
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Call the linearSearch2D method to search for the target element in the 2D array
        linearSearch2D(arr, target);
    }
}
