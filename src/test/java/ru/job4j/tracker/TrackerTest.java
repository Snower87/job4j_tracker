package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 */

public class TrackerTest {

    @Test
    public void whenAddNewItemThenSucessFindByIdVer2() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        Item result = tracker.findById(test3.getId());
        assertThat(result.getName(), is(test3.getName()));
    }

    @Test
    public void whenAddNewItemThenSucessFindByIdVer1() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenSucessFindById() {
        Tracker tracker = new Tracker();
        Item newItem = new Item("test name");
        tracker.add(newItem);
        assertThat(tracker.findById(newItem.getId()), is(newItem));
    }

    @Test
    public void whenAddNewItemThenSucessFindByName() {
        Tracker tracker = new Tracker();
        Item vasia = new Item("Vasia");
        Item ivan = new Item("Ivan");
        Item petya = new Item("Petya");
        Item fedor = new Item("Fedor");
        tracker.add(vasia);
        tracker.add(ivan);
        tracker.add(petya);
        tracker.add(fedor);
        Item[] expected = new Item[1];
        expected[0] = petya;
        Item[] result  = tracker.findByName(petya.getName());
        assertThat(result, is(expected));
        }

    @Test
    public void whenTrackerHasItemsThenFindThemAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item( "test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = new Item[3];
        expected[0] = item1;
        expected[1] = item2;
        expected[2] = item3;
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}