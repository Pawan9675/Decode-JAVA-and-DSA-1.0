//        Star Triangle
//        *
//        * *
//        * * *
//        * * * *

package Week_3_Patterns;

public class StarTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
