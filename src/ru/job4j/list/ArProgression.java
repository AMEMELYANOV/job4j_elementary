package ru.job4j.list;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int result = 0;
        ListIterator<Integer> iterator = data.listIterator();
//        System.out.println(iterator.next());
        iterator.next();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if ((iterator.previous() + iterator.next()) / 2 != temp) {
                break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        checkData(data);
    }
}