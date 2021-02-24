package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String s = i + "";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                return false;
            }
        }
        return rsl;
    }
}