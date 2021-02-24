package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int remainder = 0;
        while (n >= d) {
            n -= d;
            remainder = n;
        }
        return remainder;
    }
}