package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> data = new HashMap<>();
        for (String string : strings) {
            if (data.containsKey(string)) {
                data.computeIfPresent(string, (key, value) -> true);
            } else {
                data.computeIfAbsent(string, value -> false);
            }
        }
        return data;
    }
}