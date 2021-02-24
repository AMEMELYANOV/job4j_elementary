package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (c == string[i]) {
                count++;
                if (count == number) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}