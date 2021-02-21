package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    rsl += hours[i] * 10;
                } else {
                    rsl += 8 * 10 + (hours[i] - 8) * 15;
                }
            } else {
                if (hours[i] <= 8) {
                    rsl += hours[i] * 20;
                } else {
                    rsl += 8 * 20 + (hours[i] - 8) * 30;
                }
            }
        }
        return rsl;
    }
}