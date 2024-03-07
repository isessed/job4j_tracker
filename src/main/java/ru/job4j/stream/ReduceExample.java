package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce((left, right) -> left + right);
        System.out.println(sum.get());
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum1 = people.stream()
                .reduce(
                        0,
                        (left, right) -> {
                            if (right.getAge() > 25) {
                                return left + right.getAge();
                            } else {
                                return left;
                            }
                        },
                        (left, right) -> left + right
                );
        System.out.println(sum1);
}
}
