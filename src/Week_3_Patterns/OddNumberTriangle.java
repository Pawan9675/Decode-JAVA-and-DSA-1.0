//        Odd NUmber Triangle
//        1
//        1 3
//        1 3 5
//        1 3 5 7
        package Week_3_Patterns;

public class OddNumberTriangle {
    public static void main(String[] args) {
        // Method 1- Equation Approach
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print((2*j-1)+" ");;
            }
            System.out.println();
        }

        System.out.println();

        // Method 2 - A.P. Approach
        for (int i = 1; i <= 4; i++) {         //rows
            for (int j = 1; j <= (2*i-1); j+=2) {     //columns
                System.out.print(j+" ");;
            }
            System.out.println();
        }

        System.out.println();

        // Method 3 - Taking another variable approach
        for (int i = 1; i <= 4; i++) {//rows
            int k = 1;
            for (int j = 1; j <= i; j++) {     //columns
                System.out.print(k+" ");;
                k += 2;
            }
            System.out.println();
        }
    }
}


/*
for (int i=1; i<2*n-1; i+2){
    System.out.print(i+" ");
}
Here 2*n-1 is An(last term) of A.P.
*/
