package Week_5_Multidimensional_Arrays.ExtraPractice;

import java.util.Scanner;

public class Addition_and_Multiplication_Of_Two_Matrices {
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int[][] arr, int r1, int c1, int[][] brr, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input - Addition not possible!!!");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr[i][j] + brr[i][j];
            }
        }

        System.out.println("Sum of Matrix 1 and Matrix 2: ");
        printMatrix(sum);
    }

    public static void multiply(int[][] arr, int r1, int c1, int[][] brr, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong Input - Multiplication not possible!!!");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (arr[i][k] * brr[k][j]);
                }
            }
        }

        System.out.println("Multiplication of Matrix 1 and Matrix 2: ");
        printMatrix(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of first 2D array: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the column of first 2D array: ");
        int c1 = sc.nextInt();

        int[][] mat1 = new int[r1][c1];

        System.out.println("Enter " + (r1 * c1) + " elements in a first 2D array: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the rows of second 2D array: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the column of second 2D array: ");
        int c2 = sc.nextInt();

        int[][] mat2 = new int[r2][c2];

        System.out.println("Enter " + (r2 * c2) + " elements in a second 2D array: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("Matrix 2: ");
        printMatrix(mat2);

        add(mat1, r1, c1, mat2, r2, c2);
        multiply(mat1, r1, c1, mat2, r2, c2);
    }
}
