package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        boolean is = false;
        int size = 0;
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                temp[size] = i;
                size++;
                is = true;
            }
            if (data[i] > down && data[i] < up && is) {
                if (size == 1) {
                    temp[1] = temp[0];
                    size++;
                    result[count] = Arrays.copyOf(temp, size);

                } else {
                    result[count] = Arrays.copyOf(temp, size);
                }
                count++;
                size = 0;
                temp = new int[data.length];
                is = false;
            }
            if (size > 0 && i == data.length - 1) {
                if (size == 1) {
                    temp[1] = temp[0];
                    size++;
                    result[count] = Arrays.copyOf(temp, size);
                    count++;

                } else {
                    result[count] = Arrays.copyOf(temp, size);
                    count++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
