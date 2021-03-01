package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int size = 0;
        boolean is;
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            is  = false;
            if (str[i] == ' ' || i == str.length - 1) {
                is = true;
            }
            if (str[i] != ' ') {
                temp += str[i];
            }
            if (is) {
                result[size] = temp.toCharArray();
                temp = "";
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}