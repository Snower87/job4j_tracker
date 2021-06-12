package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    private final Output out;

    public DeleteItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Enter delete id: ");
        if (tracker.delete(id)) {
            out.println("Delete operation id " + id + " was successful");
        } else {
            out.println("Delete operation id " + id + " - failed");
        }
        return true;
    }
}
