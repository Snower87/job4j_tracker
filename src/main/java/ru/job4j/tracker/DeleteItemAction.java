package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Enter delete id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete operation id " + id + " was successful");
        } else {
            System.out.println("Delete operation id " + id + " - failed");
        }
        return true;
    }
}
