package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int size = 0;
        int current;
        boolean isuniq;
        for (int i = 0; i < left.length; i++) {
            current = left[i];
            isuniq = true;
            for (int j = 0; j < right.length; j++) {
                if (current == right[j]) {
                    isuniq = false;
                }
            }
            if (isuniq) {
                result[size] = current;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
