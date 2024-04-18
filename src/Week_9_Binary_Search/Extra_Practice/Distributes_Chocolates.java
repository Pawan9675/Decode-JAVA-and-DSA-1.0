/*
You have 'n'(n <= 10^5) boxes of chocolate. Each box contains a[i] (a[i] <= 10000) chocolates.
You need to distribute these boxes among 'm' students such that the maximum number of chocolates allocated to a student is minimum.
    a) One box will be allocated to exactly one student.
    b) All the boxes should be allocated.
    c) Each student has to be allocated at least one box.
    d) Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3, skipping box 2.

Calculate and return that minimum possible number.
Assume that it is always possible to distribute the chocolates.
*/

package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Distributes_Chocolates {
    // Function to check if it is possible to distribute chocolates such that each student gets at most 'maxChocAllowed'
    public static boolean isDivisionPossible(int[] arr, int m, int maxChocAllowed){
        int numOfStudent = 1;
        int choc = 0;       // number of chocolates current student has

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChocAllowed) return false;

            if (choc + arr[i] <= maxChocAllowed){
                choc += arr[i];
            }
            else {
                numOfStudent++;
                choc = arr[i];
            }
        }
        if (numOfStudent > m) return false;
        return true;
    }

    // Function to find the minimum possible number of chocolates that can be allocated to a student
    public static int distributesChocolates (int[] arr, int m){
        int ans = 0, start = 1, end = (int)1e9;

        // Using binary search to find the minimum possible number of chocolates
        while (start <= end){
            int mid = start + (end - start)/2;

            if (isDivisionPossible(arr, m, mid)){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of students: ");
        int m = sc.nextInt();

        // Printing the minimum possible number of chocolates allocated to a student
        System.out.println("Minimum chocolates per student: " + distributesChocolates(arr, m));
    }
}