package Week_4_Arrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        // Method 1
        int min1  = arr[0];
        for (int i = 1; i < n; i++) {
            if (min1>arr[i]) min1 = arr[i];
//            min1 = Math.min(min1, arr[i]);
        }

        System.out.println("Minimum element in the given array is: "+min1);

        // Method 2
        int min2  = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min2 = Math.min(min2, arr[i]);
//            if (min2>arr[i]) min2 = arr[i];
        }

        System.out.println("Minimum element in the given array is: "+min2);
    }
}
