package Week_10_Recursion;

import java.util.Scanner;

public class Sum_1_To_N_Return_Type {
    public static int sum(int num){
        if (num == 0) return 0;
        return num + sum(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum from 1 to "+num+" is: "+sum(num));
    }
}
