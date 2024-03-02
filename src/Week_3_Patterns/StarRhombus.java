// Star Rhombus
//     * * * *
//    * * * *
//   * * * *
//  * * * *
package Week_3_Patterns;

public class StarRhombus {
    public static void main(String[] args) {

        // Method - 1
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Method - 2
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 4; j++) {     //columns
                System.out.print("*"+" ");
            }

            System.out.println();
        }

        System.out.println();
        // Method -3
        int n =4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n-i)-1; j++) {
                if(j<n-i-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
