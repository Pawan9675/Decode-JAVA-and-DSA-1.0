package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Hallow_Hourglass_Pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {     //columns
                if (j==i || j==n || i==1) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {     //columns
                if (j==i || j==n || i==1) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
