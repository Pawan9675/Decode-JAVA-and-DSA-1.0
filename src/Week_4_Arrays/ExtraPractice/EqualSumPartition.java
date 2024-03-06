/*
Check if we can partition the array into two sub-arrays with equal sum.
More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array. --> (Hint)

arr  = | 2 | 1 | 3 | 4 | 5 | 6 |
         0   1   2   3   4   5

                        i
Prefix sum of index i = Σ pref[i] = arr[0] + arr[1] + ..... arr[i]
                       j=0
Pref = | 2 | 3 | 6 | 10 | 15 | 21 |

                        n-1
Suffix sum of index i = Σ suff[i] = arr[i] + arr[i+1] + ..... arr[n-1]
                       j=i
Suff  = | 21 | 19 | 18 | 15 | 11 | 6 |


Algorithm 1:
-> Make prefix sum array
-> Make suffix sum array ( same as prefix sum bss iss loop starting ki jagah end se lagana hoga)
-> for (i = 0 to n-2)
        if (pref[i] == suff[i+1])
            return true
-> Otherwise return false

Algorithm 2:
No need to make suffix array, just prefix array se apna answer nikaal sakte hain.
1. Calculate the total sum of the array
2. suffixSum = TotalSum - prefixSum
3. Compare (suffixSum == prefixSum)

Algorithm 3:
prefixSum array banane ki bhi jarurat nhi hai.
Kyunki prefixSum hum har point pe calculate kar sakte hain.

1. For each i, whenever we are arriving at i, we can calculate prefixSum
2. Then suffixSum = TotalSum - prefixSum
3. Compare (suffixSum == prefixSum)
*/
package Week_4_Arrays.ExtraPractice;

import java.util.Scanner;

public class EqualSumPartition {
    public static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    public  static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum){
                return true;
            }
        }
        return false;
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

        System.out.println("Equal Partition possible: "+equalSumPartition(arr));
    }
}
