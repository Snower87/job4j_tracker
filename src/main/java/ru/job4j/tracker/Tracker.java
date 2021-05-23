package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 5. Tracker - хранилище. [396#271567]
 * @Описание 1. Добавьте недостающие методы в класс Tracker. В классе Tracker должны быть методы:
 * - добавление заявок - public Item add(Item item);
 * - получение списка всех заявок - public Item[] findAll();
 * - получение списка по имени - public Item[] findByName(String key);
 * - получение заявки по id - public Item findById(int id);
 * 2. Создайте класс ru.job4j.tracker.StartUI. В нем создайте метод main.
 * - Внутри метода main создайте объект Tracker. Вызовите у него метод add с объектом Item.
 * - Вызовите метод findById и найденный Item выведите на консоль.
 * 3. Напишите тесты. Протестируйте код в junit.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 1
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Метод поиска всех не нулевых заявок в хранилище
     */
    public Item[] findAll() {
        //Вариант №1
        //Item[] copyItems = new Item[items.length];
        //copyItems = Arrays.copyOf(items, this.size);
        //return copyItems;
        //Вариант №2
        return Arrays.copyOf(items, size);
    }

    /**
     * Метод поиска заявки в хранилище по ключу
     * @param key номер заявки
     */
    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size];
        int copySize = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (key.equals(item.getName())) {
                copyItems[copySize] = item;
                copySize++;
            }
        }
        return Arrays.copyOf(copyItems, copySize);
    }

    /**
     * Метод поиска заявки в хранилище
     * @param id номер заявки
     */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод генерирует номер id
     */
    private String generateId() {
        return String.valueOf(ids++);
    }
}