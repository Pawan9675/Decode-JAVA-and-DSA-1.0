package Week_3_Patterns.Assignment_Pattern;

public class Question12 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
