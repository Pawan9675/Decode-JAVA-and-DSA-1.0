/*
Star bridge
 * * * * * * *
 * * *   * * *
 * *       * *
 *           *
 */
package Week_3_Patterns;

public class StarBridge {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
