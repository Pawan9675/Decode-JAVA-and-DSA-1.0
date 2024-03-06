// Write a program to store roll number and marks obtained by 4 students side by side in a matrix.

package Week_5_Multidimensional_Arrays;

import java.util.Scanner;

public class Roll_No_and_Marks_Of_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] details = new int[4][2];

        for (int i = 0; i < details.length; i++) {
            System.out.println("Enter the details of Student "+(i+1)+" : ");
            for (int j = 0; j < details[i].length; j++) {
                if (j == 0) {
                    System.out.print("Enter Roll number: ");
                } else {
                    System.out.print("Enter marks: ");
                }
                details[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n");

        for (int i = 0; i < details.length; i++) {
            for (int j = 0; j < details[i].length; j++) {
                if (j == 0) {
                    System.out.print("Roll number: "+details[i][j]);
                } else {
                    System.out.print("\tMarks: "+details[i][j]);
                }
            }
            System.out.println();
        }
    }
}
