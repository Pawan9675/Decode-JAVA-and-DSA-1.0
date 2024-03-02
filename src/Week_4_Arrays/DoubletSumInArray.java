package Week_4_Arrays;

import java.util.Scanner;

public class DoubletSumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int x = sc.nextInt();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j] == x){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+x);
                }
            }

        }

    }
}
