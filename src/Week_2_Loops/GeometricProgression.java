package Week_2_Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        //Method - 1
        int An = (int) (1*Math.pow(2,n-1));
        for (int i=1;i<=An;i*=2){
            System.out.print(i+" ");
        }

        System.out.println();
        //Method - 2
        int a = 1, r = 2;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
