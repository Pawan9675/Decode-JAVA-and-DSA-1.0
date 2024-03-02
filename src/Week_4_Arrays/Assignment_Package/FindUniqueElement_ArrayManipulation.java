// Find the unique number in a given Array where all the elements are being repeated twice
// with one value being unique.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class FindUniqueElement_ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                System.out.println("Unique element: "+arr[i]);
            }
        }
    }
}

// Second Method
/*
     for (int i = 0; i < 5; i++) {
        int count = 0;
        for (int j = 0; j < 5; j++) {
            if (arr[i] == arr[j] && i!=j) {
                count++;
            }
         }
        if (count == 0) {
            System.out.println("Unique element: "+arr[i]);
            break;
        }
    }
 */
