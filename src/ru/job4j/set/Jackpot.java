package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        boolean rsl = true;
        Set<String> set = new HashSet<>();
        int count = combination[0].length();
        for (String s : combination) {
            if (count != s.length()) {
                rsl = false;
                break;
            }
            set.addAll(Arrays.asList(s.split("")));
        }
        return set.size() == 1 && rsl;
    }
}