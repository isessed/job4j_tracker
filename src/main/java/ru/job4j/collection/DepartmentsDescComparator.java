package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return right.charAt(1) == left.charAt(1) ? left.compareTo(right)
                : Integer.compare(right.charAt(1), left.charAt(1));
    }
}
