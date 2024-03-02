package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class FindSecondMinimum_ArrayManipulation {
    public static int minimum(int[]arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
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

        int min = minimum(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }

        System.out.println("Second Minimum element is: "+minimum(arr));
    }
}
