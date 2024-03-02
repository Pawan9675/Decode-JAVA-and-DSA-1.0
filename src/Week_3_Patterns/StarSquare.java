package Week_3_Patterns;

// Star Square
// * * * *
// * * * *
// * * * *
// * * * *
public class StarSquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {         //rows
            for (int j = 1; j <= 4 ; j++) {     //columns
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
