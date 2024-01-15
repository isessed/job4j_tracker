package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public void whenSortItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Pavel"),
                new Item("Arsenyi"),
                new Item("Dmitry")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Arsenyi"),
                new Item("Dmitry"),
                new Item("Pavel")
        );
        assertThat(items).isEqualTo(expected);
    }
}