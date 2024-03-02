package Week_3_Methods;

import java.util.Scanner;

public class GCD {
    public static int gcd1(int a, int b){
        int hcf = 1;
        for (int i = 1; i <= Math.min(a,b) ; i++) {
            if (a%i==0 && b%i==0) hcf = i;
        }
        return hcf;
    }
    public static int gcd2(int a, int b){       //Optimized
        int hcf = 1;
        for (int i = Math.min(a,b); i >=1 ; i--) {
            if (a%i==0 && b%i==0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("HCF of "+a+" & "+b+" is: "+gcd1(a,b));
        System.out.println("HCF of "+a+" & "+b+" is: "+gcd2(a,b));

    }
}
