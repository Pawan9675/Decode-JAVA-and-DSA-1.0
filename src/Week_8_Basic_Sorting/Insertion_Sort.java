/*
Time Complexity:
    Worst time Complexity : O(n^2)
    Average time Complexity : O(n^2)
    Best time Complexity : O(n)

Space Complexity: O(1)

Stability? : Stable

Maximum swaps = n(n-1)/2, where n is the length of the array
*/
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void printArray(int[] arr){
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);


        /*for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break; // If the current element is greater than or equal to the element to its left,
                            // it means the current element and all elements to its left are already in sorted order.
                            // Therefore, we break out of the inner loop early to save unnecessary comparisons.
            }
        }*/

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
