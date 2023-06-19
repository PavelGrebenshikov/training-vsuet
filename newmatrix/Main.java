import myMatrix.Matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        double[][] A = {
                {1, 2, 25},
                {4, 25, 6},
                {25, 8, 9}
        };
        double[][] B = {
                {9, 8, 7},
                {6, 15, 4},
                {19, 2, 1}
        };

        double[][] result = matrix.addMatrix(A, B);
        System.out.println(Arrays.deepToString(result));
        double[][] result2 = matrix.subtractMatrix(A, B);
        System.out.println(Arrays.deepToString(result2));
        double[][] result3 = matrix.transposeMatrix(A);
        System.out.println(Arrays.deepToString(result3));
        double[][] result4 = matrix.multiplyMatrix(A, B);
        System.out.println(Arrays.deepToString(result4));
        double result5 = matrix.determinant(A);
        System.out.println(result5);
        double[][] result6 = matrix.subtractMatrix(A, B);
        System.out.println(Arrays.deepToString(result6));
        matrix.addMatrixToFile(A);
        matrix.outputLastMatrix();


    }
}
