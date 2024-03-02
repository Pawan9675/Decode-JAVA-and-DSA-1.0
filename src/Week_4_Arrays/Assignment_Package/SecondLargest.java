// Find the second-largest element in the given Array in one pass.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int max1, max2;
        max1 = max2 = arr[0];

        for (int i = 1; i < n ; i++) {
            if (arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.println("Second Largest element in the given array is: "+max2);
    }
}
