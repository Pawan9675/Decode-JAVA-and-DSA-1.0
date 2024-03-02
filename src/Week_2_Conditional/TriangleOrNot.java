package Week_2_Conditional;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side(a) of the triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side(b) of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side(c) of the triangle: ");
        int c = sc.nextInt();

        if ((a+b)>c && (b+c)>a && (a+c)>b) System.out.println("It will be a triangle");
        else System.out.println("It can't be triangle");
    }
}
