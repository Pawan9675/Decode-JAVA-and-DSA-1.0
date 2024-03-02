package Week_3_Patterns.Assignment_Pattern;

public class Question15 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print((char) (i+64)+" ");
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            int k = 65;
            for (int j = 1; j <= n-i ; j++) {
                System.out.print((char) (k++)+" ");
            }
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print(" "+" ");
                k++;
            }
            for (int j = 1; j <= n-i ; j++) {
                System.out.print((char) (k++)+" ");
            }
            System.out.println();
        }
    }
}
