package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Transform_Array_Approach_3 {
    public static void printArray(int[] arr){
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
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

        System.out.println("Original Array: ");
        printArray(arr);

        int[] isVisited = new int[n];

        int x = 0;
        for (int i = 0; i < n; i++) {                       // Selection Sort
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (isVisited[j] == 1) continue;
                else {
                    if (arr[j] < minValue){
                        minValue = arr[j];
                        minIndex = j;
                    }
                }
            }
            arr[minIndex] = x;
            isVisited[minIndex] = 1;
            x++;
        }


        System.out.println("Transformed Array: ");
        printArray(arr);
    }
}
