package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Number_Changing_Pyramid {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
