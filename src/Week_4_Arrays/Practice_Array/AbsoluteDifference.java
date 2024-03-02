// Given an array sorted in increasing order of size n and an integer x,
// find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
package Week_4_Arrays.Practice_Array;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the difference the to be found: ");
        int difference = sc.nextInt();

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] - arr[j]) == difference || (arr[j] - arr[i]) == difference) {
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
