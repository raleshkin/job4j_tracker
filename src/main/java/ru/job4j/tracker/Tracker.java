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
        Item[] result = new Item[size];
        int dimensions = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                result[dimensions] = items[i];
                dimensions++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int dimensions = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName() == key) {
                result[dimensions] = items[i];
                dimensions++;
            }
        }
        result = Arrays.copyOf(result, dimensions);
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
            items[index].setName(item.getName());
        }
        return true;
    }
}