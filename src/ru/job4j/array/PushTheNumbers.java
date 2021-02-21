package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i < column) {
                array[row][i] = array[row][i + 1];
            } else if (i >= column) {
                array[row][array.length - 1 + column - i] = array[row][array.length - 1 + column - i - 1];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (j < row) {
                array[j][column] = array[j + 1][column];
            } else if (j >= row) {
                array[array.length - 1 + row - j][column] = array[array.length - 1 + row - j - 1][column];
            }
        }
        array[row][column] = 0;
    }
}