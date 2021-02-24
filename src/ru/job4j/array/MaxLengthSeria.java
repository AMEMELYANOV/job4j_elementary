package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int element = array[0];
        for (int i = 1; i < array.length; i++) {
            if (element <= array[i]) {
                count++;
                element = array[i];
            } else {
                count = 1;
                element = array[i];
            }
        }
        return count;
    }
}