// Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order.

package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Subset_Sum {

    // Function to recursively calculate the sum of all subsets of the array
    static void calculateSubsetSums(int[] array, int currentIndex, int currentSum) {
        // Base case: if we've processed all elements, print the current subset sum
        if (currentIndex >= array.length) {
            System.out.print(currentSum + " ");
            return;
        }

        // Recursive call including the current element in the subset
        calculateSubsetSums(array, currentIndex + 1, currentSum + array[currentIndex]);

        // Recursive call excluding the current element from the subset
        calculateSubsetSums(array, currentIndex + 1, currentSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The sums of all possible subsets are:");
        // Call the recursive function to print subset sums
        calculateSubsetSums(array, 0, 0);

    }
}
