package Week_2_Loops.Practice;

import java.util.Scanner;

public class PrintPrimeFactor {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n ; i++) {
            boolean flag = true;
            int res = n%i;
            if (res==0){
                for (int j = 2; j*j <=i; j++) {
                    if (i%j==0){
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println(i);
            }
        }

        //new approach
        System.out.println();
        int i = 2;
        while (i*i<=n){
            while (n%i==0){
                System.out.println(i);
                n = n/i;        //no need to check whether factor is prime or not
                                // as it will automatically check it as we keep divide n/i;
            }
            i++;
        }
        if (n>1){       //as i*i<=n so if n is prime no. then value of n will not be 1
            System.out.println(n);
            //as i*i<=n then the value of i cannot reach more than n^1/2
            // so when we divide by i quotient cannot be 1.So in case of prime number
            // quotient will always be >than 1,n=n/i therefore n is only the quotient
        }
    }
}
