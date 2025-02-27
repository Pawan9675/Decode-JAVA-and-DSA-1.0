/*
Given an array A[] of N positive integers and 3 integers X, Y, and Z,
the task is to check if there exist 4 indices (say p, q, r, s) such that the following conditions are satisfied:
    - 0 < p < q < r < s <
    - Sum of the subarray from A[p] to A[q – 1] is
    - Sum of the subarray from A[q] to A[r – 1] is Y
    - Sum of the subarray from A[r] to A[s – 1] is Z
*/

package Week_16_HashMap_And_HashSet;

import java.util.*;

public class SubarraySumCheck {
    // Function to check if four indices exist satisfying the given conditions
    static boolean checkSubarraySums(int arraySize, int arr[], int sumX, int sumY, int sumZ) {
        HashSet<Integer> prefixSumSet = new HashSet<>();
        int currentPrefixSum = 0;

        // Insert 0 to handle subarrays starting from index 0
        prefixSumSet.add(0);

        // Compute prefix sums and store them in the HashSet
        for (int i = 0; i < arraySize; i++) {
            currentPrefixSum += arr[i];
            prefixSumSet.add(currentPrefixSum);
        }

        // Check if required sums exist in the prefix sum set
        for (int sum : prefixSumSet) {
            if (prefixSumSet.contains(sum + sumX) &&
                prefixSumSet.contains(sum + sumX + sumY) &&
                prefixSumSet.contains(sum + sumX + sumY + sumZ)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array Size
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();

        // Input: Array Elements
        int arr[] = new int[arraySize];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input: Required Sum Values
        System.out.print("Enter the values of X, Y, and Z: ");
        int sumX = scanner.nextInt();
        int sumY = scanner.nextInt();
        int sumZ = scanner.nextInt();

        // Function call to check if such indices exist
        boolean isPossible = checkSubarraySums(arraySize, arr, sumX, sumY, sumZ);

        // Output Result
        System.out.println(isPossible ? "YES" : "NO");

        scanner.close(); // Close scanner to prevent memory leak
    }
}
