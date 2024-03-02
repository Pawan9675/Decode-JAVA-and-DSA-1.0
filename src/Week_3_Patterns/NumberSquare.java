package Week_3_Patterns;
// Number Square
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
//
//        1	 2	3	4
//        5	 6	7	8
//        9	 10	11	12
//        13 14	15	16

public class NumberSquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {         //rows
            for (int j = 1; j <= 4 ; j++) {     //columns
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 4 ; i++) {         //rows
            for (int j = 1; j <= 4 ; j++) {     //columns
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();
        int k = 1;
        for (int i = 1; i <= 4 ; i++) {         //rows
            for (int j = 1; j <= 4 ; j++) {     //columns
                System.out.print((k++)+"\t");
            }
            System.out.println();
        }
    }
}
