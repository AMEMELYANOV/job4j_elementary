package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int element : data) {
            if (value == element) {
                count++;
            }
        }
        return 2 * count < data.length;
    }
}