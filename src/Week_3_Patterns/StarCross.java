/*
Star Cross
 *       *
   *   *
     *
   *   *
 *       *

 */
package Week_3_Patterns;

public class StarCross {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {         //rows
            for (int j = 1; j <= 5; j++) {     //columns
                if (i == j || i+j == 5+1){
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
