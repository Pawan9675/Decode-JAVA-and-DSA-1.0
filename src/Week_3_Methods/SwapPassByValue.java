package Week_3_Methods;

import java.util.Scanner;

public class SwapPassByValue {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        swap(a,b);
        System.out.println("a: "+a+" & b: "+b);     //Pass by value -> no swapping
    }
}
