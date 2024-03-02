package Week_2_Loops.Practice;

import java.util.Scanner;

public class PalindromeMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;

        int ans = 0;
        while (temp!=0){
            int i = temp%10;
            temp =  temp/10;
            ans = ans*10+i;
        }
        if (ans == num) System.out.println(num+" is Palindrome");
        else System.out.println(num+" is not palindrome");
    }
}
