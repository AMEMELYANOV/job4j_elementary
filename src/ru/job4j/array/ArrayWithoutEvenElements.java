package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int size = 0;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                size++;
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                continue;
            }
            result[index] = data[i];
            index++;
        }
        return result;
    }
}