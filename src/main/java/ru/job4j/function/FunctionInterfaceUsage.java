package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {

    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier = () -> new HashSet<>(list);
        Set<String> strings = supplier.get();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
