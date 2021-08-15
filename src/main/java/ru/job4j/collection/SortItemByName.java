package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Comparator;

/**
 * Class SortItemByName компаратор для Item по полю name 1) реализация сортировки (#95)
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 1
 */

public class SortItemByName implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
