package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    public static Set<String> sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return new TreeSet<>(list);
    }
}
