// Alphabet Square
//A B C D
//A B C D
//A B C D
//A B C D

//A A A A
//B B B B
//C C C C
//D D D D

//A B C D
//E F G H
//I J K L
//M N O P

//a b c d
//a b c d
//a b c d
//a b c d

//a a a a
//b b b b
//c c c c
//d d d d

//a b c d
//e f g h
//i j k l
//m n o p

package Week_3_Patterns;
public class AlphabetSquare {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 65; j <= 68; j++) {     //columns
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 65; i <= 68; i++) {         //rows
            for (int j = 1; j <= 4; j++) {     //columns
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
        System.out.println();
        int k = 65;
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4; j++) {     //columns
                System.out.print((char)(k++)+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 97; j <= 100; j++) {     //columns
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 97; i <= 100; i++) {         //rows
            for (int j = 1; j <= 4; j++) {     //columns
                System.out.print((char)i+" ");
            }
            System.out.println();
        }

        System.out.println();
        int m = 97;
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= 4; j++) {     //columns
                System.out.print((char)(m++)+" ");
            }
            System.out.println();
        }
    }
}
