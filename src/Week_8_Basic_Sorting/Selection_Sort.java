/*
Time complexity :
    Worst Case Time Complexity is: O(N2)
    Average Case Time Complexity is: O(N2)
    Best Case Time Complexity is: O(N2)

Space Complexity : O(1)

Stability? : Unstable
*/
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Selection_Sort {
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

        for (int i = 0; i < n-1; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
