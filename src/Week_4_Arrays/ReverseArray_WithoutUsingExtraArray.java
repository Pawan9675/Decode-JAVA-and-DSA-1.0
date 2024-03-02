package Week_4_Arrays;

import java.util.Scanner;

public class ReverseArray_WithoutUsingExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }

        //using for loop
       /* for (int i = 0; i <n/2 ; i++) {
            int j = arr.length-1-i;     // i+j = arr.length-1 --> j = arr.length-1-i
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/

        // using while loop
        int i = 0, j = arr.length-1;        // Advantages -> Using this, We can reverse the part of the array by specifying the value of i and j
        while (i<=j){                       // e.g. int i = 2, j = 5
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed Array: ");
        for (int k = 0; k<=n-1; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
