/*
Time Complexity:
    Worst time Complexity : O(n^2)
    Average time Complexity : O(n^2)
    Best time Complexity : O(n)

Space Complexity: O(1)

Stability? : Stable
*/
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Bubble_Sort_1 {
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

        for (int i = 0; i < n-1; i++) {             // (n-1) Passes
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
