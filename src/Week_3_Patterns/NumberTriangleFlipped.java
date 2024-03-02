// Number Triangle Flipped
//              1
//            1 2
//          1 2 3
//        1 2 3 4

package Week_3_Patterns;

public class NumberTriangleFlipped {
    public static void main(String[] args) {
        //Method - 1
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Method -2
        int n = 4;
        for(int i = 0; i < n; i++) {
            int s = 1;
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(s++);
                }

            }
            System.out.println();
        }
    }
}
