package Week_1_Basics;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value of "+ch+" is: "+ (int)ch); //Type Casting
    }
}
