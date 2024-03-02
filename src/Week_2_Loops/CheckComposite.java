package Week_2_Loops;

import java.util.Scanner;

public class CheckComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n/2 ; i++) {
            if (n%i==0) {
                isPrime = false;
                System.out.println(n+" is composite number");
                break;
            }
        }
        if (n==1) System.out.println("Neither Prime Nor Composite");
        else if (isPrime) System.out.println(n+" is prime number");
//        else System.out.println(n+" is not prime number");
    }
}
