package ru.job4j.tracker;

public class FindItemIdAction implements UserAction {
    private final Output out;

    public FindItemIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Enter find id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Find item with " + id + " was successful.");
            System.out.println(item.toString());
        } else {
            System.out.println("Find item with " + id + " by id - failed");
        }
        return true;
    }
}
