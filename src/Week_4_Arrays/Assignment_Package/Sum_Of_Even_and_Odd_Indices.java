// Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class Sum_Of_Even_and_Odd_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sumEvenInx = 0;
        int sumOddInx = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEvenInx += arr[i];
            } else {
                sumOddInx += arr[i];
            }
        }
        System.out.println("Sum of elements at even indices: " + sumEvenInx);
        System.out.println("Sum of elements at odd indices: " + sumOddInx);
        System.out.println("Difference b/w the sum of elements at even indices to the sum of elements at odd indices: "+(sumEvenInx-sumOddInx));
    }
}
