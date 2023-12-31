package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {

    private static SingleTracker instance = null;

    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll(List<Item> items) {
        return tracker.findAll();
    }

    public boolean replaceItem(int id, Item item) {
        return tracker.replace(id, item);
    }

    public void deleteItem(int id) {
        tracker.delete(id);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findByName(String name) {
        return tracker.findByName(name);
    }
}
