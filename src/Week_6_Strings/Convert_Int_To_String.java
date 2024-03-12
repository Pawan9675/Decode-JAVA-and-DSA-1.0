package Week_6_Strings;

import java.util.Scanner;

public class Convert_Int_To_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Converting num to string using built-in method (typecasting)
        String str1 = String.valueOf(num);  // Using String.valueOf()
        String str2 = Integer.toString(num);  // Using Integer.toString()
        System.out.println(str1);
        System.out.println(str2);

        // Converting num to string using concatenation
        String str3 = "" + num;  // Using concatenation with an empty string
        System.out.println(str3);
    }
}
