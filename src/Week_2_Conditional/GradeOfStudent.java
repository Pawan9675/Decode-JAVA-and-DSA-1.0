package Week_2_Conditional;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of a student: ");
        int marks = sc.nextInt();

//        if (marks>=81 && marks<=100) System.out.println("Very Good`");
//        if (marks>=61 && marks<=80) System.out.println("Good");
//        if (marks>=41 && marks<=60) System.out.println("Average");
//        if (marks<=40)System.out.println("Fail");

        //Power of else-if
        if (marks>=81 && marks<=100) System.out.println("Very Good`");
        else if (marks>=61) System.out.println("Good");
        else if (marks>=41) System.out.println("Average");
        else System.out.println("Fail");
    }
}
