package ru.job4j.lambda;

import java.util.*;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(x -> System.out.println("Max: " + x));
    }

    private static Optional<Integer> max(int[] data) {
        List<Integer> lst = new ArrayList<>();
        for (int datum : data) {
            lst.add(datum);
        }
        return lst.size() == 0 ? Optional.empty() : Optional.of(Collections.max(lst));
    }
}
