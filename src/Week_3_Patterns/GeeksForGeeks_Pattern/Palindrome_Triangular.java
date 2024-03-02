package Week_3_Patterns.GeeksForGeeks_Pattern;

public class Palindrome_Triangular {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4-i; j++) {     //columns
                System.out.print(" "+" ");
            }
            for (int j = i; j >= 1; j--) {     //columns
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i-1; j++) {     //columns
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
