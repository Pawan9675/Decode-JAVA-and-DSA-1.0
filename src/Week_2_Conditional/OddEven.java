package Week_2_Conditional;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Odd-Even
        if (num%2==0) System.out.println(num+" is even number");
        else System.out.println(num+" is odd number");

        //Divisible by 5
        if (num%5==0) System.out.println(num+" is divisible by 5");
        else System.out.println(num+" is not divisible by 5");


    }
}
