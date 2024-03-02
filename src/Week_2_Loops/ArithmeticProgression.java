package Week_2_Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        //Method - 1
        int An = 1+(n-1)*2;
        int Bn = 4+(n-1)*3;
        for (int i=1;i<=An;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=4;i<=Bn;i+=3){
            System.out.print(i+" ");
        }

        System.out.println();
        //Method - 2
        int a = 4, d = 3;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
