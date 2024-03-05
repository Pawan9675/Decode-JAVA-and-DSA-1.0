package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class DoubletSumOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int left = 0, right = n-1;
        boolean flag = false;
        while (left<=right){
            if (arr[left]+arr[right] == target){
                System.out.println("Indices are : "+(++left)+" , "+(++right));
                flag = true;
            }
            else if (arr[left]+arr[right] > target) right--;
            else left++;
        }
        if (!flag) System.out.println(-1);
    }
}
