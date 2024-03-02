package Week_2_Conditional;

import java.util.Scanner;

public class AreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the Rectangle: ");
        double b = sc.nextDouble();

        double area = l * b;
        double peri = 2 * (l + b);

        System.out.println("Area of Rectangle with length "+l+" and breadth "+b+" is: "+area);
        System.out.println("Perimeter of Rectangle with length "+l+" and breadth "+b+" is: "+peri);

        if (area>peri) System.out.println("Area of Rectangle is greater than its Perimeter");
        else System.out.println("Area of Rectangle is less than its Perimeter");

    }
}
