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


*/
package Week_4_Arrays.ExtraPractice;

public class EqualSumPartition {
    public static void main(String[] args) {

    }
}
