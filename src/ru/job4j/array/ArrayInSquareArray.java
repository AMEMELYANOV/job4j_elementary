package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = array.length;
        int index = 0;
        while (Math.sqrt(length) % 1 != 0) {
            length++;
        }
        length = (int) Math.sqrt(length);
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (index < array.length) {
                    result[i][j] = array[index];
                    index++;
                }
            }
        }
        return result;
    }
}