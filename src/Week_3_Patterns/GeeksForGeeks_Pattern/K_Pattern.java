package Week_3_Patterns.GeeksForGeeks_Pattern;

public class K_Pattern {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
