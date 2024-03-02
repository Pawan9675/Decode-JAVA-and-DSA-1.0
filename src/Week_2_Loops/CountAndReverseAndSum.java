package Week_2_Loops;

import java.util.Scanner;

public class CountAndReverseAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int count = 0;
        int ans = 0;
        int sum = 0;
        while (num!=0){
            int i = num%10;
            num  = num/10;
            count++;
            ans = ans*10+i;
            sum += i ;
        }
        System.out.println("Given number has "+count+" digits");
        System.out.println("Reverse of the number is: "+ans);
        System.out.println("Sum of digits of a given number is: "+sum);
    }
}
