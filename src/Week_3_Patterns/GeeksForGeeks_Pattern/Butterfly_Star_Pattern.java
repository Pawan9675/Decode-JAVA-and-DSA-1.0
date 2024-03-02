package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Butterfly_Star_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2*(4-i) ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2*(4-i) ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}