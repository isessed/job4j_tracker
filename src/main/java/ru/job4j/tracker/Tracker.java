package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        for (Item item : items) {
            if (item != null) {
                size++;
            }
        }
        Item[] rsl = Arrays.copyOf(items, size);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        size = 0;
        for (Item item : items) {
            if (item != null && key.equals(item.getName())) {
                size++;
            }
        }
        Item[] rsl = Arrays.copyOf(items, size);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}