package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Hallow_Triangle_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i || i==4) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
