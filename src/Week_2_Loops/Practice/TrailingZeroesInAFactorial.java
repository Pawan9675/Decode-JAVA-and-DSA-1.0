package Week_2_Loops.Practice;

import java.util.Scanner;

public class TrailingZeroesInAFactorial {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;
        int powerOf5 = 5;

        while (n>=powerOf5){
            res = res + (n/powerOf5);
            powerOf5*=5;
        }
        System.out.println("Trailing zeroes in "+n+" factorial is: "+res);
    }
}
