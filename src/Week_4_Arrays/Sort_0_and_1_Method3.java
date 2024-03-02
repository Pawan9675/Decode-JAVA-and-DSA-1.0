package Week_4_Arrays;

import java.util.Scanner;
// TWO PASS SOLUTION
public class Sort_0_and_1_Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int numOfOnes = 0, numOfZeroes = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 0){
                numOfZeroes++;
            }
        }

        numOfOnes = arr.length-numOfZeroes;

        int k = 0;
        for (int i = 1; i <=numOfZeroes ; i++) {
            arr[k++] = 0;
        }
        for (int i = 1; i <=numOfOnes; i++) {
            arr[k++] = 1;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
