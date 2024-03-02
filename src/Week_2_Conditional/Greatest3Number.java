package Week_2_Conditional;

import java.util.Scanner;

public class Greatest3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number(a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number(b):  ");
        int b = sc.nextInt();
        System.out.print("Enter the third number(c): ");
        int c = sc.nextInt();

        if (a>=b && a>=c) System.out.println(a+" is greater than "+b+" and "+c);
        else if (b>=a && b>=c) System.out.println(b+" is greater than "+a+" and "+c);
        else System.out.println(c+" is greater than "+a+" and "+b);

        if (a<=b && a<=c) System.out.println(a+" is smaller than "+b+" and "+c);
        else if (b<=a && b<=c) System.out.println(b+" is smaller than "+a+" and "+c);
        else System.out.println(c+" is smaller than "+a+" and "+b);
    }
}
