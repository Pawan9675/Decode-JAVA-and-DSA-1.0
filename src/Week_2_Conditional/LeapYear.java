package Week_2_Conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int x = sc.nextInt();

//        if (x%4==0 && x%100!=0 || x%400==0) System.out.println("Leap year");
//        (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        if (x%4==0){
            if (x%100==0){
                if (x%400==0){
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not a Leap Year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
