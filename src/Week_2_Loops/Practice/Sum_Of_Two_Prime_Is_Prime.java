package Week_2_Loops.Practice;

import java.util.Scanner;

public class Sum_Of_Two_Prime_Is_Prime {
    public static boolean isPrime(int n ){
       if (n<=1) return false;
       for (int i = 2; i <= n/2 ; i++) {
            if (n%i==0) return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();


        if (isPrime(n) && isPrime(n-2)){
            System.out.println(true);
        }
        else System.out.println(false);

    }
}
