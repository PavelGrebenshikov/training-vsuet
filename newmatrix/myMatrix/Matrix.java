package myMatrix;

import java.io.*;
import java.util.Arrays;

public class Matrix {

    public static void outputLastMatrix() {

        try (FileReader fr = new FileReader("matrix.txt");
             BufferedReader br = new BufferedReader(fr))
        {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // запись матрицы в файл
    public static void addMatrixToFile(double[][] matrix) {
        File file = new File("matrix.txt");

        try {
            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    writer.write(matrix[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
            writer.close();
            System.out.println("True");
        } catch (IOException e) {
            System.out.println("False");
        }
    }

    // сложение матриц
    public static double[][] addMatrix(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    // вычетание матриц
    public static double[][] subtractMatrix(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    // Транспонирование матриц
    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
    // Умножение матриц
    public static double[][] multiplyMatrix(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        if (colsA != rowsB) {
            throw new IllegalArgumentException("The number of columns in matrix A must match the number of rows in matrix B");
        }
        double[][] result = new double[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    // Детермина́нт матрицы
    public static double determinant(double[][] A) {
        int n = A.length;
        if (n != A[0].length) {
            throw new IllegalArgumentException("The matrix must be square");
        }
        double det = 0;
        if (n == 1) {
            det = A[0][0];
        } else if (n == 2) {
            det = A[0][0] * A[1][1] - A[1][0] * A[0][1];
        } else {
            for (int j1 = 0; j1 < n; j1++) {
                double[][] m = new double[n - 1][];
                for (int k = 0; k < n - 1; k++) {
                    m[k] = new double[n - 1];
                }
                for (int i = 1; i < n; i++) {
                    int j2 = 0;
                    for (int j = 0; j < n; j++) {
                        if (j == j1) {
                            continue;
                        }
                        m[i - 1][j2] = A[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0, j1 + 2.0) * A[0][j1] * determinant(m);
            }
        }
        return det;
    }

    // Сумма матриц
    public static double sumMatrix(double[][] A) {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j];
            }
        }
        return sum;
    }
}
