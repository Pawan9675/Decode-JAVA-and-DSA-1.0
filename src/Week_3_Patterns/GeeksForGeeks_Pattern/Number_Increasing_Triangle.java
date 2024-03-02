package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Number_Increasing_Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
