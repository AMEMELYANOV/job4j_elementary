package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] result = new int[(number + "").length()];
        int index = 0;
        while (number > 0) {
            result[index] = number % 10;
            number = number / 10;
            index++;
        }
        return result;
    }
}
