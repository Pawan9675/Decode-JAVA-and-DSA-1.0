package Week_3_Methods.Assignment_Methods;
import java.util.Scanner;
public class OddNumberBetweenTwoNumbers {
    public static void oddNumber(int a, int b){
        if (a > b){
            oddNumber(b,a);
            return;
        }
        for (int i = a; i <= b ; i++) {
            if (i%2 != 0){
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Odd Numbers between "+a+" and "+b+" are: ");
        oddNumber(a,b);
    }
}
