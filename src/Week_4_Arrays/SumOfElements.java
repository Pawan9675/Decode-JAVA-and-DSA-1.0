package Week_4_Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum  = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements of given array is: "+sum);
    }
}
