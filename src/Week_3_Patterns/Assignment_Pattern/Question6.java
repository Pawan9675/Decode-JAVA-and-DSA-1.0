package Week_3_Patterns.Assignment_Pattern;

public class Question6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i==1 || i==4 || j==1 || j==6){
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
