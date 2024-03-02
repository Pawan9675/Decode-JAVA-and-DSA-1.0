//Star Plus
//              *
//              *
//            *****
//              *
//              *

        package Week_3_Patterns;

public class StarPlus {
    public static void main(String[] args) {
        // n should be odd to find the middle row and column
        for (int i = 1; i <= 5; i++) {         //rows
            for (int j = 1; j <= 5; j++) {     //columns
                if (i == (5/2)+1 || j == (5/2)+1){
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
