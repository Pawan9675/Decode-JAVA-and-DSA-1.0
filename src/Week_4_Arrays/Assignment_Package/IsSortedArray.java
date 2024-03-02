// Check if the given array is sorted or not.
package Week_4_Arrays.Assignment_Package;
import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}