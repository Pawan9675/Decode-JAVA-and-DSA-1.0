package Week_3_Patterns.Practice_Pattern;

public class Reversed_Alphabet_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
