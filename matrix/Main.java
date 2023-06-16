import mypackage.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колонок: ");
        int column = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int row = scanner.nextInt();

        Matrix mat = new Matrix(column, row); // Создание объекта класса
        int[][] matrix = mat.createMatrix(); // Метод создания матрицы и присвоение к переменной matrix

        System.out.println("Вывод матрицы");
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Вывод чисел главной диагонали");
        mat.outputNumbersMainDiagonalMatrix(matrix); // Вывод чисел главной диагонали

        System.out.println("Вывод разности элементов нижней диагонали");
        mat.outputDifferenceElementsLowerDiagonal(matrix); // Вывод разности элементов нижней диагонали

        System.out.println("Вывод произведения всех элементов матрицы");
        mat.outputCompositionElementsArrays(matrix); // Вывод произведения всех элементов матрицы

    }

}
