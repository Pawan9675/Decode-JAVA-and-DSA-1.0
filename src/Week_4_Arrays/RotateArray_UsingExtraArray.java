package Week_4_Arrays;
import java.util.Scanner;
public class RotateArray_UsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k = k % n;

        int[] ans = new int[n];
        int a = 0;

        for (int i = n-k; i <n; i++) {
            ans[a++] = arr[i];
        }

        for (int i = 0; i <n-k ; i++) {
            ans[a++] = arr[i];
        }
        System.out.print("Rotated Array: ");
        for (int m = 0; m<=n-1; m++) {
            System.out.print(ans[m]+" ");
        }
    }
}
