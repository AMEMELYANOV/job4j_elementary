package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        System.out.println(words.toString());
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                result += words[i];
                break;
            }
            result = result + words[i] + " ";
        }
        return result;
    }
}
