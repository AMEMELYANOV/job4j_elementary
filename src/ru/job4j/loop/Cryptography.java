package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() > 4) {
            StringBuilder builderString = new StringBuilder(s);
            for (int i = 0; i < builderString.length() - 4; i++) {
                builderString.setCharAt(i, '#');
            }
            s = builderString.toString();
        }
        return s;
    }
}