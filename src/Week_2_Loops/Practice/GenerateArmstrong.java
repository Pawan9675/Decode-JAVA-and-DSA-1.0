package Week_2_Loops.Practice;

import java.util.Scanner;

public class GenerateArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        for (int i = 1; i <= range ; i++) {
            int temp1 = i;
            int temp2 = i;

            int sum = 0;
            int count = 0;
            while (temp1!=0){
                //int i = temp1%10;
                temp1  = temp1/10;
                count++;
            }
            while (temp2!=0){
                int x = temp2%10;
                temp2  = temp2/10;
                sum += (int) Math.pow(x,count);
            }

            if (sum == i) System.out.println(i);
        }
    }
}
