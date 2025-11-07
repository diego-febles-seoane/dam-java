package com.docencia.programacion;

public class Ejercicio27 {
    public static int sumRow(int[][] matrix, int rowIndex) {
        if (matrix == null)
            return 0;
        if (rowIndex < 0 || rowIndex >= matrix.length)
            return 0;
        int[] row = matrix[rowIndex];
        if (row == null)
            return 0;
        int sum = 0;
        for (int v : row) {
            sum += v;
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int colIndex) {
        if (matrix == null)
            return 0;
        if (colIndex < 0)
            return 0;
        int sum = 0;
        for (int[] row : matrix) {
            if (row == null)
                continue;
            if (colIndex >= 0 && colIndex < row.length) {
                sum += row[colIndex];
            }
        }
        return sum;
    }
}
