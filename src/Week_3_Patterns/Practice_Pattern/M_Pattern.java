package Week_3_Patterns.Practice_Pattern;

public class M_Pattern {
    public static void main(String[] args) {
        int n = 11;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n ; j++) {
                if (i==j && i!=n) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n ; j++) {
                if (i+j==n+1 && i!=n) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
