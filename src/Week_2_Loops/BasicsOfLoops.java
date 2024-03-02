package Week_2_Loops;

import java.util.Scanner;

public class BasicsOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println("Hello World!!!");
        }

        int i = 1;
        for (;i<=n;){
            System.out.println("Hello Pawan!!!");
            i++;
        }
    }
}
