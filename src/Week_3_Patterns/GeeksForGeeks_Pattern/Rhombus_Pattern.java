package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Rhombus_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 4 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 4 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
