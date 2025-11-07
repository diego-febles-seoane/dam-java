package com.docencia.programacion;

public class Ejercicio40 {
    private final char[][] board;

    public Ejercicio40() {
        // inicializar tablero 3x3 con espacios
        board = new char[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
        }
    }

    public boolean placeMark(int row, int col, char player) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3)
            return false;
        if (player != 'X' && player != 'O')
            return false;
        if (board[row][col] != ' ')
            return false;
        board[row][col] = player;
        return true;
    }

    public char checkWinner() {
        // filas
        for (int r = 0; r < 3; r++) {
            if (board[r][0] != ' ' && board[r][0] == board[r][1] && board[r][1] == board[r][2])
                return board[r][0];
        }
        // columnas
        for (int c = 0; c < 3; c++) {
            if (board[0][c] != ' ' && board[0][c] == board[1][c] && board[1][c] == board[2][c])
                return board[0][c];
        }
        // diagonales
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
        return ' ';
    }
}
