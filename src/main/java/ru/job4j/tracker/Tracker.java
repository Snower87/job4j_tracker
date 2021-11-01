package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 5. Tracker - хранилище. [396#271567] (ver.1)
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
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 6. Метод замены заявки. Tracker.replace. [211748#271564] (ver.2)
 * @Описание 1. Реализуйте метод Tracker.replace, используя метод indexOf. Причем вызов indexOf должен быть один.
 * 2. Проверьте работу метода replace с помощью тест-метода. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 7. Метод удаления заявки Tracker.delete. [211749#271565] (ver.3)
 * @Описание 1. Реализуйте метод Tracker.delete, используя indexOf. Причем вызов indexOf должен быть один.
 * Метод delete возвращает true, если заявление удалено или false, если index не найдет по id.
 * 2. Добавьте тест-метод, проверяющий удаление. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 8. Что такое валидация? [246864#271566] (ver.4)
 * @Описание 1. Доработайте методы delete и replace в классе ru.job4j.tracker.Tracker.
 * 2. В методах должна быть проверка параметров - валидация.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 6. Изменить программу Tracker из 2-го модуля. [#10039 #23670] (ver.5)
 * @Описание 1. Замените массив на коллекцию java.util.ArrayList в проекте Tracker.
 * Эти изменения коснутся API класса Tracker:
 * - public Item[] findAll() и public Item[] findByName(String key).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 5
 */

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    /**
     * Метод возвращает index по id
     * @param id номер заявки
     * @return
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /**
     * Метод поиска всех не нулевых заявок в хранилище
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод поиска заявки в хранилище по ключу
     * @param key номер заявки
     */
    public List<Item> findByName(String key) {
        List<Item> copyItems = new ArrayList<>(items.size());
        for (int index = 0; index < items.size(); index++) {
            Item item = this.items.get(index);
            if (key.equals(item.getName())) {
                copyItems.add(this.items.get(index));
            }
        }
        return copyItems;
    }

    /**
     * Метод поиска заявки в хранилище
     * @param id номер заявки
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод генерирует номер id
     */
    private String generateId() {
        return String.valueOf(ids++);
    }

    /**
     * Метод замены старого итема на новый по номеру id (ключу)
     * @param id номер заявки
     * @param item новый итем
     * @return true - замена успешно прошла, false - не произошла
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            item.setId(id);
            items.set(index, item);
        }
        return res;
    }

    /**
     * Метод удаления итема по номеру id
     * @param id номер заявки
     * @return true - удаление прошло успешно, false - не произошло
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            items.remove(index);
        }
        return res;
    }
}