package Week_2_Conditional;

import java.util.Scanner;

public class IdentifyQuadrant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x>0 && y>0) System.out.println("("+x+","+y+") lies in first quadrant");
        else if (x<0 && y>0) System.out.println("("+x+","+y+") lies in second quadrant");
        else if (x<0 && y<0) System.out.println("("+x+","+y+") lies in third quadrant");
        else if (x>0 && y<0) System.out.println("("+x+","+y+") lies in fourth quadrant");
        else if (x==0 && y==0)System.out.println("("+x+","+y+") lies at origin");       //sequence matters
        else if (x==0) System.out.println("("+x+","+y+") lies at y-axis");
        else System.out.println("("+x+","+y+") lies at x-axis");
    }
}
