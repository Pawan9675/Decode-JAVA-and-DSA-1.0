/*
Given an array of integers, print a sum triangle from it such that the first level (the bottom
level in triangular fashion) contains all array elements. Each subsequent level contains
one fewer element, and the value at each position in the next level is the sum of
consecutive elements from the current level.

Input:
n = 5
arr = {1, 2, 3, 4, 5}

Output:
[48]
[20, 28]
[8, 12, 16]
[3, 5, 7, 9]
[1, 2, 3, 4, 5]
*/

package Week_10_Recursion.Practice_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Construct_Triangle {

    public static void generateSumTriangle(int[] arr) {
        // Base case: If the array is empty or has only one element, nothing more to process
        if (arr.length < 1) return;

        // Create an array `nextLevel` that will store the sums of consecutive elements
        int[] nextLevel = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            // Sum of consecutive elements
            nextLevel[i] = arr[i] + arr[i + 1];
        }

        // Recursive call: generate the sum triangle for the next level (one smaller array)
        generateSumTriangle(nextLevel);

        // After the recursion unfolds, print the current level of the triangle
        System.out.println("Current level: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Constructing the sum triangle:");

        generateSumTriangle(arr);
    }
}
