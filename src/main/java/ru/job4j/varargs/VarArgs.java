package ru.job4j.varargs;

import java.util.Formatter;

public class VarArgs {

    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static String format(String format, Object... args) {
        return new Formatter().format(format, args).toString();
    }

    public static void main(String[] args) {
        System.out.println(text(1, "aaa", "bbb", "ccc", "ddd"));
    }
}
