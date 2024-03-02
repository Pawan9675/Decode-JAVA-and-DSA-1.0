package Week_2_Conditional;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextInt();
        System.out.print("Enter b: ");
        double b = sc.nextInt();

        System.out.print("Enter the Operator: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+' :
                System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
                break;
            case '-' :
                System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
                break;
            case '*' :
                System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
                break;
            case '/' :
                System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
                break;
            case '%' :
                System.out.println("Modulus of "+a+" and "+b+" is: "+(a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
