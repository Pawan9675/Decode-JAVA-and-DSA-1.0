package Week_4_Arrays;

import java.util.Scanner;

public class SecondLargest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i = 0; i < n; i++) {
//            max = Math.max(max, arr[i]);      --> work same as if condition
            if (arr[i]> max){
                max = arr[i];
                max_index = i;
            }
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
//            if (arr[i]!=max) smax = Math.max(smax, arr[i]);
//            if (arr[i]>smax && arr[i]!=max) smax = arr[i];        // This will fail when all the elements of array is same
            if (arr[i]>smax && max_index!=i) smax = arr[i];
            // we have to store the index of maximum element in the given array
            // because when all the element of the array is same then
            // it will return the Integer.MIN_VALUE and the test case fails
        }
        System.out.println("Second Maximum element in the given array is: "+smax);
    }
}
