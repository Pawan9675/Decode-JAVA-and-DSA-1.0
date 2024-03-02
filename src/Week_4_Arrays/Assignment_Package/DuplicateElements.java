// WAP to find the duplicate elements from the given array of elements.
package Week_4_Arrays.Assignment_Package;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element is: "+arr[i]);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        if (!flag) System.out.println("No Duplicate Found");

    }
}
