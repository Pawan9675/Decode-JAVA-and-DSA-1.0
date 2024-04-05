package Week_9_Binary_Search.Extra_Practice.Linear_Search;

import java.util.Scanner;

public class MinMax_2D {

    // Method to find the minimum element in a 2D array
    public static int findMin(int[][] arr) {
        // Check if the array is empty
        if (arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        // Initialize min to the maximum integer value
        int min = Integer.MAX_VALUE;

        // Iterate through the 2D array to find the minimum element
        for (int[] row : arr) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }

        return min;
    }

    // Method to find the maximum element in a 2D array
    public static int findMax(int[][] arr) {
        // Check if the array is empty
        if (arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        // Initialize max to the minimum integer value
        int max = Integer.MIN_VALUE;

        // Iterate through the 2D array to find the maximum element
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
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

        // Find the minimum and maximum elements in the 2D array
        int min = findMin(arr);
        int max = findMax(arr);

        // Print the minimum and maximum elements
        System.out.println("Minimum element in the 2D array: " + min);
        System.out.println("Maximum element in the 2D array: " + max);
    }
}
