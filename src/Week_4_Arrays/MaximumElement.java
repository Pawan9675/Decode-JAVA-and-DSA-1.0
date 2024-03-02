package Week_4_Arrays;

import java.util.Scanner;

public class MaximumElement {
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
        int max1  = arr[0];
        for (int i = 1; i < n; i++) {
            if (max1<arr[i]) max1 = arr[i];
            //max1 = Math.max(max1, arr[i]);
        }

        System.out.println("Maximum element in the given array is: "+max1);

        // Method 2
        int max2  = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max2 = Math.max(max2, arr[i]);
//            if (max2<arr[i]) max2 = arr[i];

        }

        System.out.println("Maximum element in the given array is: "+max2);
    }
}
