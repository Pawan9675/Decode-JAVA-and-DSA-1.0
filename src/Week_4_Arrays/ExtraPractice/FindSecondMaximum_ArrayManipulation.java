package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class FindSecondMaximum_ArrayManipulation {
    public static int maximum(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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

        int max = maximum(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        System.out.println("Second Maximum element is: "+maximum(arr));
    }
}
