// Given an array of size n, generate and print all possible combinations of r elements in array.
package Week_10_Recursion.Practice_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Generate_Combination{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        // Input: Array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Input: Number of elements in each combination (r)
        System.out.print("Enter the number of elements in each combination (r): ");
        int r = scn.nextInt();

        // Array to hold each combination
        int[] combination = new int[r];

        // Start the recursive process of generating combinations
        System.out.println("All combinations of size " + r + " are:");
        combine(arr, combination, 0, 0, r);
    }

    public static void combine(int[] arr, int[] combination, int i, int currentIndex, int r) {
        // If the current combination is ready (has r elements), print it
        if (currentIndex == r) {
            System.out.println(Arrays.toString(combination));
            return;
        }

        // If we've processed all elements in the array, return
        if (i >= arr.length) {
            return;
        }

        // Case 1: Take the current element and add it to the combination
        combination[currentIndex] = arr[i];
        combine(arr, combination, i + 1, currentIndex + 1, r); // Move to the next element with the current included

        // Case 2: Don't take the current element and move to the next element
        combine(arr, combination, i + 1, currentIndex, r); // Move to the next element without including the current
    }
}

