package Week_3_Patterns.Practice_Pattern;

public class Small_Capital_Alphabet {
    public static void main(String[] args) {
        int n = 5;

        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                if (k%2==0) System.out.print((char)(k+64) +" ");
                else System.out.print((char)(k+96)+" ");
                k++;
            }
            System.out.println();
        }
    }
}
