package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
//        char[] diagonal = extractDiagonal(board);
//        for (int index = 0; index < diagonal.length; index++) {
//            if (diagonal[index] == 'X') {
//                result = monoHorizontal(board, index) || monoVertical(board, index);
//            }
//        }
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                result = monoHorizontal(board, index) || monoVertical(board, index);
                break;
            }
        }
        return result;
    }
}