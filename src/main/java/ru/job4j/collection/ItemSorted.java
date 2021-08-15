package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 /* Class ItemSorted сортировка структуры Item по полю name 1) тесты для сортировки: 1-по идентификатору (id), (#95)
 * 2-по полю name
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 1
 */

public class ItemSorted {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(4, "Serg"),
                new Item(3, "Anna"),
                new Item(4, "Petr"),
                new Item(1, "Zena"),
                new Item(0, "Nina")
        );

        System.out.println("Элементы до сортировки:");
        System.out.println(items);
        System.out.println();

        System.out.println("Сортировка коллекции Item по id:");
        System.out.println("<< по возрастанию >>");
        Collections.sort(items);
        System.out.println(items);

        System.out.println("<< по убыванию >>");
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
        System.out.println();

        System.out.println("Сортировка коллекции Item по полю данных Name:");
        System.out.println("<< по возрастанию >>");
        Collections.sort(items, new SortItemByName());
        System.out.println(items);

        System.out.println("<< по убыванию >>");
        Collections.sort(items, new SortItemByName().reversed());
        System.out.println(items);
    }
}
