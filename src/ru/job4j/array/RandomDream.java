package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String result;
        if (num % prizes.length == 0) {
            result = prizes[prizes.length - 1];
        } else {
            result = prizes[num % prizes.length - 1];
        }
        return result;
    }
}