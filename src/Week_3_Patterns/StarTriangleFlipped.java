/*
// Star Triangle Flipped
       *
     * *
   * * *
 * * * *

 */
package Week_3_Patterns;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        // Method 1
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Method 2
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4; j++) {     //columns
                if (i+j>4) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
