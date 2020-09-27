package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
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

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        System.out.println("item.getName() = " + item.getName());
        Item result = tracker.findById(item.getId());
        System.out.println("result = " + result);
    }
}