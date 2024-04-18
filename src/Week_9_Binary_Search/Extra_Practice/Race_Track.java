/*
A new racing track for kids is being built in New York with 'n' starting spots. The spots are located along a straight line at
positions x1, x2... xn(xi <=10^9). For each 7, xi+ 1 > xi.
At a time only 'm' children are allowed to enter the race. Since the racetrack is for kids, they may run into each other while
running. To prevent this, we want to choose the starting spots such that the minimum distance between any two of them is as
large as possible. What is the largest minimum distance?
*/
package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Race_Track {
    // Function to check if it is possible to place 'm' kids such that the minimum distance between any two of them is 'dist'
    public static boolean isPossible(int[] arr, int m, int dist){
        int kidPlaced = 1;
        int lastKid = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastKid >= dist){
                kidPlaced++;
                lastKid = arr[i];
            }
        }
        return kidPlaced >= m;
    }

    // Function to find the largest minimum distance between any two kids
    public static int raceTrack(int[] arr, int m){
        if (m > arr.length) return -1;
        int start = 1, end = (int) 1e9;
        int ans = 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (isPossible(arr, m, mid)){
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of starting spots: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the n numbers denoting the location of each spot: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of children: ");
        int m = sc.nextInt();

        // Printing the largest minimum distance between any two kids
        System.out.println("Largest minimum distance between any two kids: " + raceTrack(arr, m));
    }
}
