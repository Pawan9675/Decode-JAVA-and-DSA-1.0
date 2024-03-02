package Week_4_Arrays;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number of students: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the marks of the students: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Roll numbers of students whose marks is less that 35: ");
        for (int i = 0; i < n; i++) {
            if (arr[i]<35){
                System.out.println("Roll no: "+ i);
            }
        }
    }
}
