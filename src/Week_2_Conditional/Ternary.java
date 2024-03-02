package Week_2_Conditional;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

//        String s = (num%2==0)? "EVEN":"ODD";
//        System.out.println(s);

        System.out.println((num%2==0)? "EVEN":"ODD");
    }
}
