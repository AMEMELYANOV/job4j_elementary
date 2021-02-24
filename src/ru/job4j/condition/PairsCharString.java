package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return (l.length() == 0 && r.length() == 0) || (l.charAt(0) == r.charAt(r.length() - 1)
                && l.charAt(l.length() - 1) == r.charAt(0));
    }
}