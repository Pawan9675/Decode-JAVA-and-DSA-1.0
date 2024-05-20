package Week_10_Recursion.Extra_Practice;

import java.util.Scanner;

public class Sum_Of_Elements_In_Array {
    public static int sumOfElements(int[] arr, int index){
        if (index == arr.length) return 0;
        return arr[index] + sumOfElements(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of the elements of the given array is: " + sumOfElements(arr, 0));
    }
}
