package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder rsl = new StringBuilder(Character.toString(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                rsl.append(s.charAt(i + 1));
            }
        }
        return rsl.toString();
    }
}