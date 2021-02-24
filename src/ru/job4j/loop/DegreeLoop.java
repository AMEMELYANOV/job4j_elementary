package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = a;
        for (int i = 0; i < n - 1; i++) {
            rsl *= a;
        }
        return rsl;
    }
}