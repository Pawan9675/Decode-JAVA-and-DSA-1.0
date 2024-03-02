package Week_3_Patterns.Practice_Pattern;

public class Prime_Pattern_Triangle {
    public static void main(String[] args) {
        int n = 6;
        int num = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j <= num; j++) {
                boolean flag = true;
                for (int k = 2; k <= j; k++) {
                    if (j % k == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println(j);
            }
            System.out.println();
        }
    }
}
