package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Reversed_Number_Triangle_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
