/*
Given Q queries, check if the given number is present in the array or not.
Note: Value of all the elements in the array is less than 10 to the power 5.
*/

package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class Queries_ElementPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] freq = new int[100001];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        System.out.print("Enter the number of queries: ");
        int query = sc.nextInt();

        while (query>0){
            System.out.print("Enter the number to be searched: ");
            int num = sc.nextInt();
            if (freq[num] > 0) System.out.println("YES");
            else System.out.println("NO");
            query--;
        }

    }
}
