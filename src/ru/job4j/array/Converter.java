package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        int index  = 0;
        /* Кол-во элементов многомерного массива */
        for (int[] arr : array) {
            size += arr.length;
        }
        int[] temp = new int[size];
        /* Многомерный массив в одномерный */
        for (int[] arr : array) {
            for (int i : arr) {
                temp[index] = i;
                index++;
            }
        }
        while (Math.sqrt(size) % 1 != 0) {
            size++;
        }
        index = 0;
        size = (int) Math.sqrt(size);
        int[][] result = new int[size][size];
        /* Одномерный массив в квадратный */
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (index < temp.length) {
                    result[i][j] = temp[index];
                    index++;
                }
            }
        }
        return result;
    }
}