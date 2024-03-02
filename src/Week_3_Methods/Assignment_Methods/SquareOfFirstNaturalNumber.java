package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class SquareOfFirstNaturalNumber {
    public static int square(int n){
        return n*n;
    }
    public static void firstSquare(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Square of "+i+" is "+square(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        firstSquare(n);
    }
}
