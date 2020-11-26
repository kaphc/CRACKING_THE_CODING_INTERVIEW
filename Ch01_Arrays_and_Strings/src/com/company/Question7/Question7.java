package com.company.Question7;

public class Question7 {
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }

    private static void rotateMatrix(int[][] matrix) {
        int matrixLength = matrix.length;

        int halfMatrixLength;
        if (matrixLength % 2 == 0) {
            halfMatrixLength = (matrixLength / 2);
        } else {
            halfMatrixLength = (matrixLength / 2) + 1;
        }

        for (int i = 0; i < halfMatrixLength; i++) {
            for (int j = i; j < matrixLength - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrixLength - j - 1][i];
                matrix[matrixLength - j - 1][i] = matrix[matrixLength - i - 1][matrixLength - j - 1];
                matrix[matrixLength - i - 1][matrixLength - j - 1] = matrix[j][matrixLength - i - 1];
                matrix[j][matrixLength - i - 1] = temp;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayMatrix(matrix1);
        rotateMatrix(matrix1);
        displayMatrix(matrix1);

        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 14, 15}};
        displayMatrix(matrix2);
        rotateMatrix(matrix2);
        displayMatrix(matrix2);
    }
}
