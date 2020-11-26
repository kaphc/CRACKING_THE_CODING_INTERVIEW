package com.company.Question7;

public class Question7 {
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }

//    private static int[][] rotateMatrix(int[][] matrix) {
//        int matrixLength = matrix.length;
//        for (int i = 0; i < matrixLength; i++) {
//            for (int j = 0; j < matrixLength; j++) {
//                int temp = matrix[i][j];
//                matrix[j][i] = matrix[j][matrixLength];
//            }
//        }
//    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayMatrix(matrix1);
    }
}
