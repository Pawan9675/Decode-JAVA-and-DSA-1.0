package Week_9_Binary_Search.Extra_Practice;

import java.util.Scanner;

public class Precision_Square_Root {
    public static double sqrt(double num, double precision){
        double start = 0, end = num;
        double ans = 0.0;
        while (start <= end){
            double mid = start + (end - start)/2;
            double value = mid*mid;
            if (Math.abs(value - num) <= precision) {
                return mid; // If the difference between the square of mid and num is within precision, return mid
            } else if (value < num) {
                ans = mid; // Update ans to current mid, as it is the closest to the square root
                start = mid + precision; // Move to the right half of the search space with precision
            } else {
                end = mid - precision; // Move to the left half of the search space with precision
            }
        }
        return ans; // Return the square root with precision
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();

        System.out.print("Enter the precision: ");
        double precision = sc.nextDouble();

        double result = sqrt(num, precision);
        System.out.println("Square root of "+num+" with precision "+precision+" is: "+result);
    }
}
