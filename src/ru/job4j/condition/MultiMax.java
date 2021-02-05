package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (result > second) {
            if (result < third) {
                result = third;
            }
        } else {
            result = second;
            if (result < third) {
                result = third;
            }
        }
        return result;
    }
}