package Week_2_Loops.Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp1 = num;
        int temp2 = num;

        int sum = 0;
        int count = 0;
        while (temp1!=0){
            //int i = temp1%10;
            temp1  = temp1/10;
            count++;
        }
        while (temp2!=0){
            int i = temp2%10;
            temp2  = temp2/10;
            sum += (int) Math.pow(i,count);
        }

        if (sum == num) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");
    }
}
