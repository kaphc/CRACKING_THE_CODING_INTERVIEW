package com.company.Question8;

public class Question8 {

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }

    public static int[][] zeroMatrix(int[][] matrix) {
        int matrixLength = matrix.length;

        boolean[] row = new boolean[matrixLength];
        boolean[] column = new boolean[matrixLength];

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int k = 0; k < matrixLength; k++) {
            if(row[k]) matrix = nullifyRow(matrix, k);
        }

        for (int l = 0; l < matrixLength; l++) {
            if(column[l]) matrix = nullifyColumn(matrix, l);
        }

        return matrix;
    }

    private static int[][] nullifyRow(int[][] matrix, int row) {
        int i=0;
        while(i<matrix.length) {
            matrix[row][i] = 0;
            i++;
        }
        return matrix;
    }

    private static int[][] nullifyColumn(int[][] matrix, int column) {
        int i=0;
        while(i<matrix.length) {
            matrix[i][column] = 0;
            i++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        /* We can reduce the space to O(1) by using the first column as a replacement for the row array
        and the first row as a replacement for the column array
         */
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayMatrix(matrix1);
        matrix1 = zeroMatrix(matrix1);
        displayMatrix(matrix1);

        int[][] matrix2 = {{1, 0, 3, 4}, {2, 4, 5, 6}, {0, 8, 9, 10}, {3, 6, 2, 12}};
        displayMatrix(matrix2);
        matrix2 = zeroMatrix(matrix2);
        displayMatrix(matrix2);
    }
}
