package ru.job4j.set;

import java.util.Iterator;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String rsl = "Вы сделали правильный выбор!";
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (s.contains(iterator.next())) {
                rsl = "Выберите другую статью...";
                break;
            }
        }
        return rsl;
    }
}