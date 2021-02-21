package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int size = 0;
        boolean is;
        for (int i = 0; i < left.length; i++) {
                  is = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    is = false;
                    break;
                }
            }
            if (is) {
                result[size] = left[i];
                size++;
            }
        }
        for (int i = 0; i < right.length; i++) {
            is = true;
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    is = false;
                    break;
                }
            }
            if (is) {
                result[size] = right[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
