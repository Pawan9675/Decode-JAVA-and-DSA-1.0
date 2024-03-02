package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Square_Fill_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
