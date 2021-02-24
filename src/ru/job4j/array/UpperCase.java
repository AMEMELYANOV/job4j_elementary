package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                result[i] = Character.toUpperCase(string[i]);
            } else {
                result[i] = string[i];
            }
        }
        return result;
    }
}