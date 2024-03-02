package Week_3_Patterns;
//Number Alphabet triangle
//1
//A B
//1 2 3
//A B C D
//1 2 3 4 5
//A B C D E F
public class NumberAlphabetTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                if (i%2==1) System.out.print(j+" ");
                else System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
