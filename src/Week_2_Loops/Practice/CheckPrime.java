package Week_2_Loops.Practice;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        if (n==1) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i=i+6){
            if (n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // O(n)
        boolean flag1 = true;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0){
                flag1 = false;
                break;
            }
        }
        if (n==1 || n==0) System.out.println("Neither prime nor composite");
        else if (flag1) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");

        //O(n^1/2)
        boolean flag2 = true;
        for (int i = 2; i*i <= n; i++) {        // i<=Math.sqrt(n) - same as i*i<=n
            if (n%i==0){
                flag2 = false;
                break;
            }
        }
        if (n==1 || n==0) System.out.println("Neither prime nor composite");
        else if (flag2) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");

        //O(n^1/2) - much more efficient
        System.out.println(checkPrime(n));

    }
}
