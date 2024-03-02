/*
We have, arr = {2, 1, 3, 4, 5}

                0  1  2   3   4     --> indices
        pref = {2, 3, 6, 10, 15}

        pref[0] = arr[0]                                                = arr[0]
        pref[1] = arr[0] + arr[1]                                       = pref[0] + arr[1]
        pref[2] = arr[0] + arr[1] + arr[2]                              = pref[1] + arr[2]
        pref[3] = arr[0] + arr[1] + arr[2] + arr[3]                     = pref[2] + arr[3]
        pref[4] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4]            = pref[3] + arr[4]

        So, we get
            For any i>=1
            pref[i] = pref[i-1] + arr[i]
*/

package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class PrefixSum_WithUsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }

        System.out.println("Prefix array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(pref[i]+" ");
        }
    }
}
