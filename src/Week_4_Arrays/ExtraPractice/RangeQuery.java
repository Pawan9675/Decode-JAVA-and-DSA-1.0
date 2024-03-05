// Given an array of integers of size n. Answer q queries where
// you need to print the sum of values in a given range of indices from I to r (both included).
// Note: The values of 1 and r in queries follow 1-based indexing.
package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class RangeQuery {
    public static int[] makePrefixArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter the elements of Array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefSum = makePrefixArray(arr);

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.print("Enter the range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum: "+ans);
        }
    }
}
