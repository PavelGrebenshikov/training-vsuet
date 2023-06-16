package mypackage;

import java.util.Random;

public class Matrix {

    public static final int MAX_RANDOM_NUMBER = 1000;

    public int column;
    public int row;
    public int[][] matrix;

    public int[][] createMatrix() {

        matrix = new int[column][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generationRandomNumber();
            }
        }

        return  matrix;
    }

    public void outputDifferenceElementsLowerDiagonal(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ( j <= i) {} else {
                    result -= matrix[i][j];
                }
            }
        }
        System.out.println(result);
    }

    public void outputCompositionElementsArrays(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result += matrix[i][j];
            }
        }
        System.out.println(result);
    }

    public void outputNumbersMainDiagonalMatrix(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    System.out.println(matrix[i][j]);
                }
            }
        }

    }

    public static int generationRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Matrix() {}

    public Matrix(int column, int row) {
        this.column = column;
        this.row = row;
    }


}
