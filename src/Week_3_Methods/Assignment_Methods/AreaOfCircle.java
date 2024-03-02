package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class AreaOfCircle {
    public static double area(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int r = sc.nextInt();

        System.out.println("Area of a circle is: "+area(r));
    }
}
