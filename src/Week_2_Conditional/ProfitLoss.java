package Week_2_Conditional;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price (In Rs.): ");
        double cp = sc.nextDouble();
        System.out.print("Enter the Selling Price (In Rs.): ");
        double sp = sc.nextDouble();

        if (cp>sp){
            System.out.println("Seller has made loss of "+(cp-sp)+" Rs.");
        }
        else if (cp<sp) {
            System.out.println("Seller has made profit of "+(sp-cp)+" Rs.");
        }
        else {
            System.out.println("SELLER HAS NO PROFIT!! NO LOSS!!");
        }
    }
}
