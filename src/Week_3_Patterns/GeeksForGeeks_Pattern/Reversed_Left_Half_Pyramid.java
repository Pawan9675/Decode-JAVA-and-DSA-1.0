package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Reversed_Left_Half_Pyramid {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
