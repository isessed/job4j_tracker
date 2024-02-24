package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            predicate = filterName -> folder.getName().contains("bug");
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        for (Folder folder : list) {
            predicate = filterSize -> folder.getSize() > 100;
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }
}
