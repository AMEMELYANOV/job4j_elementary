package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        return new HashSet<String>(Arrays.asList(s.split(""))).size() == s.length();
    }
}