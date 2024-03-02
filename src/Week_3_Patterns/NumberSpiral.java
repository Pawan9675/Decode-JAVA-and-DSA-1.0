/*
Number Spiral
1 1 1 1 1 1 1
1 2 2 2 2 2 1
1 2 3 3 3 2 1
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
package Week_3_Patterns;

public class NumberSpiral {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= 2*n-1 ; j++) {
                int a = i, b = j;
                if (i>n) a = 2*n-i;         // a+i = 2n
                if (j>n) b = 2*n-j;         // b+j = 2n
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= 2*n-1 ; j++) {
                int a = i, b = j;
                if (i>n) a = 2*n-i;
                if (j>n) b = 2*n-j;
                System.out.print(n+1-Math.min(a,b)+" ");        // k + Math.min(a,b) = n + 1
            }
            System.out.println();
        }
    }
}