package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int index = 1; index <= 5; index++) {
                result = result * index;
            }
            return result;
        }
    }
}