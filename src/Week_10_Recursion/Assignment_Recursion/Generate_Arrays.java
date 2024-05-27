// Given two sorted arrays A and B, generate all possible arrays such that the first element is taken from A then from B then from A,
// and so on in increasing order till the arrays are exhausted. The generated arrays should end with an element from B
package Week_10_Recursion.Assignment_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array A
        System.out.println("Enter the number of elements in array A:");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array A (sorted in increasing order):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Input array B
        System.out.println("Enter the number of elements in array B:");
        int m = scanner.nextInt();
        int[] B = new int[m];
        System.out.println("Enter the elements of array B (sorted in increasing order):");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        // Generate and print the result
        List<List<Integer>> result = new ArrayList<>();
        generateArrays(A, B, new ArrayList<>(), 0, 0, true, result);

        System.out.println("Generated arrays:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }

        scanner.close();
    }

    private static void generateArrays(int[] A, int[] B, List<Integer> current, int i, int j, boolean fromA, List<List<Integer>> result) {
        if (fromA) {
            for (int k = i; k < A.length; k++) {
                if (current.isEmpty() || A[k] > current.get(current.size() - 1)) {
                    List<Integer> newCurrent = new ArrayList<>(current);
                    newCurrent.add(A[k]);
                    generateArrays(A, B, newCurrent, k + 1, j, false, result);
                }
            }
        } else {
            for (int k = j; k < B.length; k++) {
                if (B[k] > current.get(current.size() - 1)) {
                    List<Integer> newCurrent = new ArrayList<>(current);
                    newCurrent.add(B[k]);
                    result.add(newCurrent);
                    generateArrays(A, B, newCurrent, i, k + 1, true, result);
                }
            }
        }
    }
}
