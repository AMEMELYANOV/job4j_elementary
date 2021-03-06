package ru.job4j.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        char[] cArr = String.join("", s.split(" ")).toCharArray();
        Map<Character, List<Integer>> rsl = new HashMap<>();
        for (int i = 0; i < cArr.length; i++) {
            if (rsl.containsKey(cArr[i])) {
                rsl.get(cArr[i]).add(i);
            } else {
                rsl.put(cArr[i], new ArrayList<>(Collections.singletonList(i)));
            }
        }
        return rsl;
    }
}