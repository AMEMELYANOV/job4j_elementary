package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int size = 0;
        boolean isuniq = true;
        for (int i = 0; i < left.length; i++) {
            result[size] = left[i];
            size++;
        }
        for (int j = 0; j < right.length; j++) {
            isuniq = true;
            for (int i = 0; i < result.length; i++) {
                if (result[i] == right[j]) {
                    isuniq = false;
                    break;
                }
            }
            if (isuniq) {
                result[size] = right[j];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
