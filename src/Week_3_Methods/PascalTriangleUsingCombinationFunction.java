package Week_3_Methods;

public class PascalTriangleUsingCombinationFunction {
    public static int factorial (int num){
        int fact = 1;
        for (int i = 2; i <=num ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int combination(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
    }
}