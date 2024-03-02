package Week_3_Methods;

public class CombinationAndPermutation {
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
    public static int permutation(int n, int r){
        return factorial(n)/factorial(n-r);
    }
    public static void main(String[] args) {
        System.out.println(combination(7,2));
        System.out.println(permutation(5,1));
        System.out.println(factorial(0));
    }
}
