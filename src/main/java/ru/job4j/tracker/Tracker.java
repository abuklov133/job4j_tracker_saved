package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int count = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[count++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, count);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[count++] = items[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            int temp = items[index].getId();
            item.setId(temp);
            items[index] = item;
        }
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < count; i++) {
            if (items[i].getId() == id) {
                result = i;
            }
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index, items, index + 1, count - index - 1);
            items[count - 1] = null;
            count--;

        }
    }
}