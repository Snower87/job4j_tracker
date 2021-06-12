package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
                //"0" - это пункт меню "Создать новую заявку"
                //"Item name" - это будет имя новой заявки.
                //"1" - это пункт меню "Выйти".
        );
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", /* входные параметры для ReplaceAction */ String.valueOf(item.getId()), replacedName, "1"}
                //"0" - вызов меню "Изменить/заменить значение Item".
                //String.valueOf(item.getId()) - идентификатор Item.
                //replacedName - новое значение Item.
                //"1" - вызов пункта меню "Выйти".
        );
        Output out = new StubOutput();
        UserAction[] actions = {
                new EditItemAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", /* входные параметры для DeleteAction */ String.valueOf(item.getId()), "1"}
                //"0" - вызов меню "Удалить Item".
                //String.valueOf(item.getId()) - идентификатор Item.
                //"1" - вызов пункта меню "Выйти".
        );
        Output out = new StubOutput();
        UserAction[] actions = {
                new DeleteItemAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "------------------------" + System.lineSeparator() +
                      "         MENU           " + System.lineSeparator() +
                      "------------------------" + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator()
        ));
    }
}