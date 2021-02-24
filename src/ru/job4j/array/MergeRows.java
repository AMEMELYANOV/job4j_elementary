package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] result = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[index] = data[i][j];
                index++;
            }
        }
        return result;
    }
}
