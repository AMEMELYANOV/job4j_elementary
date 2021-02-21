package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String result = fio[0] + " ";
        for (int i = 1; i < fio.length; i++) {
            result = result + fio[i].toCharArray()[0] + ".";
        }
        return result;
    }
}