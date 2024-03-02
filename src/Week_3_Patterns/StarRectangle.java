package Week_3_Patterns;// Star Rectangle
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class StarRectangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 5; j++) {     //columns
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
