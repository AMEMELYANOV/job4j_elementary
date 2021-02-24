package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        int counter = 1;
        while (counter <= n) {
            if (n % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
