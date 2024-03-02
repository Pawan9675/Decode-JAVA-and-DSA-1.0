// Program to find the last occurrence of element x in a given array
package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int lastOccurrence = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num){
                lastOccurrence = i;
            }
        }

        if (lastOccurrence == -1) System.out.println("NOT FOUND!!!");
        else System.out.println("Last Occurrence of "+num+" is: "+lastOccurrence);
    }
}
