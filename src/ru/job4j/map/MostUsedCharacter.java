package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        Map<Character, Integer> chars = new TreeMap<>();
        str = String.join("", str.toLowerCase(Locale.ROOT).split(" "));
        for (Character c : str.toCharArray()) {
            if (chars.containsKey(c)) {
                chars.computeIfPresent(c, (key, value) -> value + 1);
            } else {
                chars.computeIfAbsent(c, value -> 1);
            }
        }
        int maxValue = Collections.max(chars.values());
        for (Character key : chars.keySet()) {
            if (chars.get(key) == maxValue) {
                rsl = key;
                break;
            }
        }
        return rsl;
    }
}