package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Right_Pascal_Triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
