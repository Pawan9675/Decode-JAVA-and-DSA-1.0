package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Hallow_Diamond_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i)System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
        for (int i = 3; i >=1; i--) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i)System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
