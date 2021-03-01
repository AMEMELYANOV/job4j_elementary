package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        List<Integer> list = new ArrayList(data);
        int sum = list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i - 1) + list.get(i + 1)) / 2 != list.get(i)) {
                return 0;
            }
            sum += list.get(i);
        }
        return sum + list.get(list.size() - 1);
    }
}