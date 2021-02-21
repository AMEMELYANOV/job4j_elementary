package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int size = 0;
        int count = 0;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            size += data[i].length;
        }
        int[] result = new int[size];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (!(i + j == sum || data[i][j] == 0)) {
                    result[index] = data[i][j];
                    count++;
                    index++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}