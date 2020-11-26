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

        for (int layer = 0; layer < (matrixLength / 2) + 1; layer++) {
            int last = matrixLength - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offset = i - layer;

                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayMatrix(matrix1);
        rotateMatrix(matrix1);
        displayMatrix(matrix1);

        int[][] matrix2 = {{1, 0, 3, 4}, {2, 4, 5, 6}, {0, 8, 9, 10}, {3, 6, 2, 12}};
        displayMatrix(matrix2);
        rotateMatrix(matrix2);
        displayMatrix(matrix2);
    }
}
