package Week_2_Conditional;

import java.util.Scanner;

public class DivisibleBy5OR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%5==0 || num%3==0){
            System.out.println("Given is number is divisible by 5 or 3.");
        }
        else{
            System.out.println("Given is number is not divisible by 5 or 3.");

        }
    }
}
