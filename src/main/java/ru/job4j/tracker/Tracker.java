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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;

    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        if (id > items.length) {
            return false;
        } else {
            int index = indexOf(id);
            item.setId(id);
            items[index] = item;
            return true;
        }
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            if (index < size) {
                System.arraycopy(items, index + 1, items, index, size - index);
            }
            items[size] = null;
            size--;
        }
    }
}