//        Floyd's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
package Week_3_Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
