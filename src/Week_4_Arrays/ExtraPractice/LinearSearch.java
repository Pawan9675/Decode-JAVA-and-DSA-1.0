// Search if the given element x is present in the array or not and find the index.
// If not present then return the index as -1. (Linear Search)
package Week_4_Arrays.ExtraPractice;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num){
                System.out.println(num+" found at index "+i);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Element not found");
    }
}
