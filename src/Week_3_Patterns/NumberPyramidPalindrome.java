package Week_3_Patterns;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1; j--) {     //columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
