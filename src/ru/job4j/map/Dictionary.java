package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String key = String.valueOf(string.toCharArray()[0]);
            if (rsl.containsKey(key)) {
                rsl.get(key).add(string);
            } else {
                rsl.put(key, new ArrayList<>(Collections.singletonList(string)));
            }
        }
        return rsl;
    }
}