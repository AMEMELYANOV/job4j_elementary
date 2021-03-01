package ru.job4j.list;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = Arrays.asList(s.split(""));
        StringBuilder result = new StringBuilder();
        Collections.sort(list);
        for (String str : list) {
            result.append(str);
        }
        return result.toString();
    }
}