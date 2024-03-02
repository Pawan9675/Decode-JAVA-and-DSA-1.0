package Week_2_Conditional;

import java.util.Scanner;

public class Greatest3NumberUsingNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number(a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number(b):  ");
        int b = sc.nextInt();
        System.out.print("Enter the third number(c): ");
        int c = sc.nextInt();

        //Greatest Number
        if (a>b){
            if (a>c) System.out.println(a+" is greatest");
            else System.out.println(c+" is greatest");
        }
        else {
            if (b>c) System.out.println(b+" is greatest");
            else System.out.println(c+" is greatest");
        }

        //Smallest Number
        if (a<b){
            if (a<c) System.out.println(a+" is smallest");
            else System.out.println(c+" is smallest");
        }
        else {
            if (b<c) System.out.println(b+" is smallest");
            else System.out.println(c+" is smallest");
        }
    }
}
