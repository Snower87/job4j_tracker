package ru.job4j.tracker;

import java.util.List;

/**
 * @Раздел Блок 2. ООП / 6. ООА\П
 * @Задание 2. Singleton. [#94606]
 * @Описание 1. Создайте класс ru.job4j.SingleTracker. Этот класс должен реализовывать шаблон singleton.
 * Этот класс должен реализовывать все методы от класса Tracker.
 * Чтобы не копировать код из класса трекер воспользуйтесь композицией объектов.
 * 2. Реализуйте singleton и добавьте недостающие методы. Оставьте ссылку на коммит.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 31.07.2021
 * @version 1
 */

public class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getTracker() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
