package Week_3_Patterns.Assignment_Pattern;

public class Question20 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     //columns
                if (j==1 || j==2*i-1 || i==n || j==(2*i)/2) System.out.print("*"+" ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <= n-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     //columns
                if (j==1 || j==2*i-1 || j==(2*i)/2) System.out.print("*"+" ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }
}
