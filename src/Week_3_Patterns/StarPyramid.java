// Star Pyramid
//      *
//    * * *
//  * * * * *
//* * * * * * *
package Week_3_Patterns;

public class StarPyramid {
    public static void main(String[] args) {
        //Method - 1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        // Method - 2
        int n = 4;
        int nsp = n-1;      //Number of Spaces
        int nst = 1;        //Number of Stars
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= nsp; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nst; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

    }
}
