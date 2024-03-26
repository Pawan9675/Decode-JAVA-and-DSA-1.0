// Given an array, arr[] containing ‘n’ integers, the task is to find an integer (say K) such that after
//replacing each and every index of the array by |ai – K| where ( i ∈ [1, n]),
// results in a sorted array. If no such integer exists that satisfies the above condition then return -1.


/*
Mathematics used in this Question:

                a1      a2      a3      a4      a5
                |       |       |       ...     ...
             |k-a1|  |k-a2|  |k-a3|

             Generalising...
             |k - am| >= |k - am - 1|
             (k - am)^2 - (k - am-1)^2 >= 0
             (k - am + k - am-1) * (k - am - k + am-1) >= 0
             [2k - (am + am-1)](am-1 - am) >= 0

             If am-1 - am >= 0,
                2k - [am + am-1] >= 0
                2k >= am + am-1
                k >= (am + am-1)/2 --> Min

             If am-1 - am < 0,
                k < (am + am-1)/2 --> Max

*/
package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Sorted_After_Subtracting_K {
    public static void printArray(int[] arr) {
        for (int element : arr) {
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

        float kMin = Integer.MIN_VALUE;
        float kMax = Integer.MAX_VALUE;
        boolean flag = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) { // kMin
                kMin = Math.max(kMin, (float) (arr[i] + arr[i + 1]) / 2);
            } else { // kMax
                kMax = Math.min(kMax, (float) (arr[i] + arr[i + 1]) / 2);
            }
            if (kMin > kMax) {
                flag = false;
                break;
            }
        }

        if (!flag) System.out.println(-1);
        else if (kMin == kMax) {
            if (kMin - (int) kMin == 0) {         //kMin and kMax are integers
                System.out.println("There is only one value of K : " + (int) kMin);
            } else System.out.println(-1);
        } else {
            if (kMin - (int) kMin > 0) {
                kMin = (int) kMin + 1;
            }
            System.out.println("Range of k is: " + "[" + (int) kMin + " , " + (int) kMax + "]");
        }
    }
}
