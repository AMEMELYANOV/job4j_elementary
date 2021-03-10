package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> rsl = indexOf(data, el);
        return rsl.isEmpty() ? -1 : rsl.get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> rsl = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = Optional.of(i);
            }
        }
        return rsl;
    }
}
