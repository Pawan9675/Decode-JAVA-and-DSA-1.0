package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class CountDigitAndPrintSquare {
    public static int square(int num){
        return num*num;
    }
    public static int countDigit(int num){
        int count = 0;
        while (num != 0){
            count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits in "+num+" is: "+countDigit(num));
        System.out.println("Square of "+countDigit(num)+" is: "+square(countDigit(num)));

    }
}
