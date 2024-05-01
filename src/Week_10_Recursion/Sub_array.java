package Week_10_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub_array {
    public static void printSubArray_loop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void printSubArray_Recursion (ArrayList<Integer> list, int[] arr, int idx){
        if (idx == arr.length){
            System.out.println(list);
            return;
        }
        /*
        For Subset of Array:
        printSubArray_Recursion(list, arr, idx+1);
        list.add(arr[idx]);
        printSubArray_Recursion(list, arr, idx+1);
        list.removeLast();
         */

        // For Sub-array of an array:
        // Exclude the current element and move to the next index
        printSubArray_Recursion(list, arr, idx + 1);
        // Include the current element in the sub-array if the list is empty or the last element is equal to the previous element
        if (list.isEmpty() || list.getLast() == arr[idx - 1]) {
            list.add(arr[idx]);
            // Recur for the next index
            printSubArray_Recursion(list, arr, idx + 1);
            // Backtrack to explore other sub-arrays by removing the last element
            list.removeLast();
        }
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

        printSubArray_loop(arr);
        printSubArray_Recursion(new ArrayList<>(), arr, 0);
    }
}
