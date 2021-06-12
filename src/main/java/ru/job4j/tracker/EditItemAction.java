package ru.job4j.tracker;

public class EditItemAction implements UserAction {
    private final Output out;

    public EditItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Enter id: ");
        String newValue = input.askStr("Enter new value item: ");
        Item newItem = new Item(newValue);
        if (tracker.replace(id, newItem)) {
            out.println("Edit operation id " + id + " was successful");
        } else {
            out.println("Edit operation id " + id + " - failed");
        }
        return true;
    }
}
