package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        List<String> lst = new ArrayList<>(Arrays.asList(s.split(" ")));
        HashSet<String> set = new HashSet<>();
        for (String el : lst) {
            set.addAll(Arrays.asList(el.split("")));
        }
        return set.size() == 26;
    }
}