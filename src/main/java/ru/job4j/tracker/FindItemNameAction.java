package ru.job4j.tracker;

public class FindItemNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter find key word: ");
        Item[] items = tracker.findByName(key);
        if (items.length != 0) {
            System.out.println("Find item by key word \"" + key + "\" was successful.");
            for (Item item: items) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("Find item by key word " + key + " - failed");
        }
        return true;
    }
}