package ru.job4j.tracker;

import java.util.List;

public class FindItemNameAction implements UserAction {
    private final Output out;

    public FindItemNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter find key word: ");
        List<Item> items = tracker.findByName(key);
        if (items.size() > 0) {
            out.println("Find item by key word \"" + key + "\" was successful.");
            for (Item item: items) {
                out.println(item.toString());
            }
        } else {
            out.println("Find item by key word " + key + " - failed");
        }
        return true;
    }
}
