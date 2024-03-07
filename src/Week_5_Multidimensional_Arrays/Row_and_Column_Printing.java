package Week_5_Multidimensional_Arrays;

public class Row_and_Column_Printing {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int m = matrix.length;      // rows
        int n = matrix[0].length;   // columns

        System.out.println("Row-wise printing: ");
        for (int i = 0; i < m; i++) {           // loop for rows
            for (int j = 0; j < n; j++) {       // loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Column-wise printing: ");
        for (int j = 0; j < n; j++) {       // loop for columns
            for (int i = 0; i < m; i++) {   // loop for rows
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
