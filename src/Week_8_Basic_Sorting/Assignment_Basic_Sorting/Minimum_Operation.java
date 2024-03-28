// Find the minimum operations required to sort the array in increasing order.
// In one operation, you can set each occurrence of one element to 0.

package Week_8_Basic_Sorting.Assignment_Basic_Sorting;

import java.util.Scanner;

public class Minimum_Operation {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void setZero(int[] arr, int temp) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                arr[i] = 0;
            }
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

        int noOfOperation = 0;

        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    setZero(arr, temp);
                    noOfOperation++;
                    break;
                }
            }
        }

        System.out.println("Minimum operations required to sort the array in increasing order: " + noOfOperation);
    }
}
