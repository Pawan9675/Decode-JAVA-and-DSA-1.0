// Given an integer m, n, and n integers, return true if the number of unique integers
// among the n integers is greater than or equal to m, else return false.
// (Integers appearing multiple times are all considered as 1 unique integer)
package Week_4_Arrays.Practice_Array;

import java.util.Arrays;
import java.util.Scanner;

public class M_GreaterThan_NumberOfUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        Arrays.sort(arr);
        int i = 0;
        int count = 1;
        while (i < n-1){
            if (arr[i] != arr[i+1]){
                count++;
            }
            i++;
        }

        System.out.println(count >= m);
    }
}
