/*
ALGORITHM:

Break array in 4 part in such a way :
                                                              (unsorted part)
            [0 0 0 0 0 . . . . .] [1 1 1 1 1 . . . . . .] [2 1 0 1 0 2 . . . . .] [2 2 2 2 2 . . . . .]
Index:      0               low-1 low               mid-1 mid                high high+1            n-1

*/

package Week_4_Arrays;

import java.util.Scanner;

public class Sort_0_1_and_2_DutchFlagAlgorithm {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }

        System.out.println("Sorted Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
