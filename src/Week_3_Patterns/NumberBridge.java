/*
Number bridge
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7
*/

package Week_3_Patterns;

public class NumberBridge{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++) {
            int k = 1;
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(k++ +" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     //columns
                System.out.print(" "+" ");
                k++;
            }
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
