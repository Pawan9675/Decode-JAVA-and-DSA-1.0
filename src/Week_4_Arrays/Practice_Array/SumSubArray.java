// Given an unsorted array A of size N that contains only non-negative integers,
// find a continuous sub-array which adds to a given number S.
// In case of multiple sub-arrays, return the sub-array which comes first on moving from left to right.
// You need to print the start and end index of answer sub-array.

package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        /*for (int i = 0; i <n ; i++) {
            int add = 0;
            int k = i;
            boolean flag = false;
            while (add<=sum){
                add += arr[k++];
                if (add == sum) {
                    System.out.println(i+" "+(k-1));
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }*/

        int i = 0, j = 0, add = 0;
        while (j < n) {
            add += arr[j];
            if (add > sum) {
                while (add > sum && i < j) {
                    add -= arr[i];
                    i++;
                }
            }
            if (add == sum) {
                System.out.print(i + " ");
                System.out.print(j);
                break;
            }
            j++;
        }

    }
}
